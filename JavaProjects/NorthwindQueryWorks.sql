Select ContactName Adi, CompanyName SirketAdi, City Sehir from Customers

Select * from Customers where City = 'Berlin'

-- case sensitive

select * from Products where CategoryID=1 or CategoryID=3

select * from Products where CategoryID=1 and UnitPrice>=10

select * from Products order by CategoryID,ProductName

select * from Products order by UnitPrice asc -- asc means ascending

select * from Products order by UnitPrice desc -- desc means descending

select * from Products where CategoryID=1 order by UnitPrice desc

select count(*) from Products where CategoryID = 2

-- Hangi kategoride kac farkli urunumuz var?

select categoryID from Products group by CategoryID --butun kategorileri tekrar ettmeyecek sekilde listele

select categoryID,count(*) from Products group by CategoryID --hangi kategoride kac urun var

select categoryID,count(*) from Products group by CategoryID having count(*)<10

select categoryID,count(*) from Products where UnitPrice>20
group by CategoryID having count(*)<10

select Products.ProductID, Products.ProductName, Products.UnitPrice, Categories.CategoryName 
from Products inner join Categories
on Products.CategoryID = Categories.CategoryID 
where Products.UnitPrice>10

-- DTO / Data Transformation Object

select * from Products inner join [Order Details] od
on p.ProductID = od.ProductID
inner join Orders o 
on o.OrderID = od.OrderID

select * from Customers c left join Orders o
on c.CustomerID = o.CustomerID 
where o.CustomerID is null
