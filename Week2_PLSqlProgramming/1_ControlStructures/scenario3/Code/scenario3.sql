BEGIN
    FOR loan_rec IN (
        SELECT LoanID, CustomerID, EndDate
        FROM Loans
        WHERE EndDate BETWEEN SYSDATE AND SYSDATE + 30
    )
    LOOP
        dbms_output.put_line('Reminder: Loan ID ' || loan_rec.LoanID ||
                             ' for Customer ID ' || loan_rec.CustomerID ||
                             ' is due on ' || TO_CHAR(loan_rec.EndDate, 'DD-Mon-YYYY'));
    END LOOP;
END;
/
COMMIT;