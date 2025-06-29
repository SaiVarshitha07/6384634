CREATE TABLE Customers (
    CustomerID NUMBER PRIMARY KEY,
    Name VARCHAR2(100),
    DOB DATE,
    Balance NUMBER,
    LastModified DATE
);

INSERT INTO Customers VALUES (1, 'John Doe', TO_DATE('1950-05-15', 'YYYY-MM-DD'), 12000, SYSDATE);
INSERT INTO Customers VALUES (2, 'Jane Smith', TO_DATE('1990-07-20', 'YYYY-MM-DD'), 1500, SYSDATE);
INSERT INTO Customers VALUES (3, 'Mary Jane', TO_DATE('1940-03-10', 'YYYY-MM-DD'), 10500, SYSDATE);
INSERT INTO Customers VALUES (4, 'Peter Parker', TO_DATE('1985-08-01', 'YYYY-MM-DD'), 4000, SYSDATE);


CREATE TABLE Loans (
    LoanID NUMBER PRIMARY KEY,
    CustomerID NUMBER,
    LoanAmount NUMBER,
    InterestRate NUMBER,
    StartDate DATE,
    EndDate DATE,
    FOREIGN KEY (CustomerID) REFERENCES Customers(CustomerID)
);

INSERT INTO Loans VALUES (1, 1, 5000, 6.5, SYSDATE, SYSDATE + 20);
INSERT INTO Loans VALUES (2, 2, 7000, 7.0, SYSDATE, SYSDATE + 40);
INSERT INTO Loans VALUES (3, 3, 6000, 6.8, SYSDATE, SYSDATE + 10); 
INSERT INTO Loans VALUES (4, 4, 8000, 7.5, SYSDATE, SYSDATE + 60);

SELECT * FROM Customers;
SELECT * FROM Loans;

BEGIN
    FOR cust_rec IN (
        SELECT c.CustomerID, l.InterestRate
        FROM Customers c
        JOIN Loans l ON c.CustomerID = l.CustomerID
        WHERE MONTHS_BETWEEN(SYSDATE, c.DOB)/12 > 60
    )
    LOOP
        UPDATE Loans
        SET InterestRate = InterestRate - 1
        WHERE CustomerID = cust_rec.CustomerID;

        dbms_output.put_line('1% interest discount applied for Customer ID: ' || cust_rec.CustomerID);
    END LOOP;
END;
/
SELECT c.CustomerID,c.Name,l.LoanID,l.LoanAmount,l.InterestRate,l.EndDate
FROM Customers c JOIN Loans l ON c.CustomerID = l.CustomerID;
COMMIT;
