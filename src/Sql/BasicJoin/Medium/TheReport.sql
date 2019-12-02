SELECT CASE
            WHEN grade >= 8 THEN name
            ELSE NULL
       END,
       grade,
       marks
FROM students
INNER JOIN grades
ON marks
BETWEEN min_mark AND max_mark
ORDER BY grade DESC, name, marks;