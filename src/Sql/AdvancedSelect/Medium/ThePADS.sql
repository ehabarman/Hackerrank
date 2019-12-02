SELECT CONCAT(Name,"(",LEFT(occupation,1),")")
FROM OCCUPATIONS
ORDER BY Name ASC, LEFT(occupation,1) ASC;

SELECT CONCAT("There are a total of ", COUNT(occupation)," ", LOWER(OCCUPATION), "s.")
FROM OCCUPATIONS
GROUP BY occupation
ORDER BY COUNT(occupation) ASC, occupation ASC;



