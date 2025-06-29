CREATE TABLE Employees (
    EmployeeID NUMBER PRIMARY KEY,
    Name VARCHAR2(100),
    Position VARCHAR2(50),
    Salary NUMBER,
    Department VARCHAR2(50),
    HireDate DATE
); 

INSERT INTO Employees VALUES (1, 'Alice Johnson', 'Manager', 70000, 'HR', TO_DATE('2015-06-15', 'YYYY-MM-DD'));
INSERT INTO Employees VALUES (2, 'Bob Brown', 'Developer', 60000, 'IT', TO_DATE('2017-03-20', 'YYYY-MM-DD'));

SELECT * FROM Employees;

CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (
    dept_name IN VARCHAR2,
    bonus_percent IN NUMBER
) IS
BEGIN
    FOR emp IN (
        SELECT EmployeeID, Salary
        FROM Employees
        WHERE Department = dept_name
    ) LOOP
        UPDATE Employees
        SET Salary = Salary + (emp.Salary * bonus_percent / 100)
        WHERE EmployeeID = emp.EmployeeID;

        dbms_output.put_line('Bonus applied to Employee ID: ' || emp.EmployeeID);
    END LOOP;
END;
/
BEGIN
    UpdateEmployeeBonus('HR', 10);
END;
/

SELECT * FROM Employees WHERE department='HR';
COMMIT;