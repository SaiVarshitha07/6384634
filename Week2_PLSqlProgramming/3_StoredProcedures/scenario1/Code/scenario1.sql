CREATE TABLE Accounts (
    AccountID NUMBER PRIMARY KEY,
    CustomerID NUMBER,
    AccountType VARCHAR2(20),
    Balance NUMBER,
    LastModified DATE,
    FOREIGN KEY (CustomerID) REFERENCES Customers(CustomerID)
);

INSERT INTO Accounts VALUES (1, 1, 'Savings', 12000, SYSDATE);
INSERT INTO Accounts VALUES (2, 2, 'Checking', 8000, SYSDATE);
INSERT INTO Accounts VALUES (3, 3, 'Savings', 10500, SYSDATE);
INSERT INTO Accounts VALUES (4, 4, 'Checking', 4000, SYSDATE);

SELECT * FROM Accounts;

CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
BEGIN
    FOR acc IN (
        SELECT AccountID, Balance
        FROM Accounts
        WHERE AccountType = 'Savings'
    ) LOOP
        UPDATE Accounts
        SET Balance = Balance + (acc.Balance * 0.01),
            LastModified = SYSDATE
        WHERE AccountID = acc.AccountID;

        dbms_output.put_line('Interest added for Account ID: ' || acc.AccountID);
    END LOOP;
END;
/

EXEC ProcessMonthlyInterest;

SELECT * FROM Accounts WHERE AccountType='Savings';
COMMIT;
