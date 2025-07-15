SELECT * FROM Accounts WHERE AccountID IN (1, 4);
CREATE OR REPLACE PROCEDURE TransferFunds (
    p_from_account_id IN NUMBER,
    p_to_account_id   IN NUMBER,
    p_amount          IN NUMBER
) IS
    v_balance NUMBER;
BEGIN
    SELECT Balance INTO v_balance
    FROM Accounts
    WHERE AccountID = p_from_account_id;

    IF v_balance >= p_amount THEN
        UPDATE Accounts
        SET Balance = Balance - p_amount,
            LastModified = SYSDATE
        WHERE AccountID = p_from_account_id;

        UPDATE Accounts
        SET Balance = Balance + p_amount,
            LastModified = SYSDATE
        WHERE AccountID = p_to_account_id;

        dbms_output.put_line('₹' || p_amount || ' transferred from Account ' || 
                             p_from_account_id || ' to Account ' || p_to_account_id);
    ELSE
        dbms_output.put_line('Insufficient balance in Account ' || p_from_account_id);
    END IF;
END;
/

BEGIN
    TransferFunds(1, 4, 500);
END;
/

SELECT * FROM Accounts WHERE AccountID IN (1, 4);
COMMIT;