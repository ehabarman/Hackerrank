select Name
From STUDENTS
where
    Marks > 75
ORDER BY RIGHT(NAME, 3), ID ASC;