ALTER TABLE Customers ADD IsVIP VARCHAR2(5);
UPDATE Customers SET IsVIP = 'FALSE' WHERE Balance>1000;
SELECT * FROM Customers;
BEGIN
    FOR cust IN (SELECT CustomerID, Balance FROM Customers) LOOP
        IF cust.Balance > 10000 THEN
            UPDATE Customers
            SET IsVIP = 'TRUE'
            WHERE CustomerID = cust.CustomerID;

            dbms_output.put_line('VIP status set for Customer ID: ' || cust.CustomerID);
        END IF;
    END LOOP;
END;
/
SELECT * FROM Customers WHERE IsVIP='TRUE';
COMMIT;
