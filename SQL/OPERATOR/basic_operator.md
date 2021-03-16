## IN Operator:

Work as OR Operator, filter data and allow to determine if values matches anyone of the list.

* SYNTAX:

SELECT
       
    Coloumn1, Coloumn2, .....
    
FROM

    Table1, Table2, .....
    
where(expr|Coloumn1) IN ('Value1' , 'Value2', .....);

## BETWEEN Operator:

filter data and allow to specify range of values to test.

* SYNTAX:

SELECT
       
    Coloumn1, Coloumn2, .....
    
FROM

    Table1, Table2, .....
    
where(expr|Coloumn1) BETWEEN begin AND end;

## NOT BETWEEN Operator:

Opposite of BETWEEN Operator.

* SYNTAX:

SELECT
       
    Coloumn1, Coloumn2, .....
    
FROM

    Table1, Table2, .....
    
where(expr|Coloumn1) NOT BETWEEN begin AND end;

## LIMIT Operator:

LIMIT is used to constrain the number of rows returned by select statement.

* SYNTAX:

SELECT
       
    Coloumn1, Coloumn2, .....
    
FROM

    Table1, Table2, .....
    
LIMIT offset, Count;

## Fetching first N Rows:

* SYNTAX:

SELECT
       
    Coloumn1, Coloumn2, .....
    
FROM

    Table1, Table2, .....
    
LIMIT N;

## IS NULL Operator

* SYNTAX:

SELECT
       
    Coloumn1, Coloumn2, .....
    
FROM

    Table1, Table2, .....
    
where(expr|Coloumn1) IS NULL;


