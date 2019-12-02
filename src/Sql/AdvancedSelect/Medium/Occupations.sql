set @c1=0, @c2=0, @c3=0, @c4=0;
select min(Doctor), min(Professor), min(Singer), min(Actor)
from(
  select
    case
         when Occupation='Doctor' then (@c1:=@c1+1)
         when Occupation='Professor' then (@c2:=@c2+1)
         when Occupation='Singer' then (@c3:=@c3+1)
         when Occupation='Actor' then (@c4:=@c4+1)
    end as counter,
    case
        when Occupation='Doctor' then Name
    end as Doctor,
    case
        when Occupation='Professor' then Name
    end as Professor,
    case
        when Occupation='Singer' then Name
    end as Singer,
    case
        when Occupation='Actor' then Name
    end as Actor
  from OCCUPATIONS
  order by Name
) temp
group by counter