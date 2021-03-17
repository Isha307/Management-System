JOIN is a method of linking one table with another table.

TYPES of MySql:-

1. CROSS JOIN

2. INNER JOIN

3. LEFT JOIN

4. RIGHT JOIN

5. SELF JOIN

## CROSS Join

Return the Cartesian Product of rows from joined tables.

* SYNTAX:

SELECT * from Table1 CROSS JOIN Table2 

where JOIN_CONDITION(OPTIONAL)

## INNER Join

Matches Rows of one table with another table.

* SYNTAX:

SELECT Coloumn1 FROM Table1 

INNER JOIN Table2 ON JOIN_CONDITION

## LEFT Join

Results in all matching rows from two tables and also the rows that are not matched from left table.

* SYNTAX:

SELECT
       
    Coloumn1
    
FROM

    Table1 
    
LEFT Join Table 2 ON JOIN_CONDITION.

## RIGHT Join

Results in all matching rows from two tables and also the rows that are not matched from right table.

* SYNTAX:

SELECT
       
    Coloumn1
    
FROM

    Table1 
    
RIGHT Join Table 2 ON JOIN_CONDITION.

## SELF Join

Used to join a table to itself.
