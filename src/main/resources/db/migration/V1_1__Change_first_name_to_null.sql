update person
set first_name = 'NA'
where first_name IS NULL;


alter table person
    alter column first_name Set Not null;