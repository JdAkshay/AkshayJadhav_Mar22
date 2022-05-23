create table tempp(
string1 varchar(100),
string2 varchar(100),
msg varchar(100));

delimiter //
create procedure PROC1(string1 varchar(100),string2 varchar(100))
begin
declare msg varchar(100);
declare num int;
select LOCATE(string1,string2) into num;
if num>0 then
insert into tempp values(string1,string2,'string1 exists in string2');
else
insert into tempp values(string1,string2,'string1 does not exists in string2');
end if;
select * from tempp;
end;//
delimiter //