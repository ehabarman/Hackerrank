SELECT t2.id, t.age, t.coins_needed, t.power
FROM (
        select p.age age, MIN(w.coins_needed) coins_needed, MAX(w.power) power
        FROM Wands w, Wands_Property p
        WHERE p.code=w.code AND p.is_evil=0  
        group BY  p.age, w.power
    ) AS t, 
    (
        SELECT  w2.id id , p2.age age , w2.coins_needed coins_needed , w2.power power
        FROM Wands w2, Wands_Property p2
        WHERE p2.code=w2.code AND p2.is_evil=0
    ) AS t2 
    
WHERE t2.age=t.age AND t2.coins_needed=t.coins_needed AND t2.power=t.power
ORDER BY t.power desc, t.age desc;