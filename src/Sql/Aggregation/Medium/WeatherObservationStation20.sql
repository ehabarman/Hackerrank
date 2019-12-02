SELECT ROUND(A.lat_n,4) 
FROM station A 
WHERE (
    SELECT ROUND(COUNT(A.id)/2)-1 
    FROM station
) = (
    SELECT COUNT(B.id) 
    FROM station B 
    WHERE B.lat_n > A.lat_n
);