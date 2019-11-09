(
    SELECT
        CITY,
        LENGTH(CITY)
    FROM
        STATION
    ORDER BY
        LENGTH(CITY),
        CITY LIMIT 1
)
UNION
(
    SELECT
        CITY,
        LENGTH(CITY)
    FROM
        STATION
    ORDER BY
        LENGTH(CITY) DESC,
        CITY ASC LIMIT 1
)