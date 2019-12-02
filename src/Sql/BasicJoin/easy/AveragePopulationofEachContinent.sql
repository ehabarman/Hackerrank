SELECT COUNTRY.continent, FLOOR(AVG(CITY.population)) AS 'avg_population'
FROM CITY
INNER JOIN COUNTRY
ON CITY.countrycode = COUNTRY.code
GROUP BY COUNTRY.continent;