# 这是基本查询
SELECT 订单号,订单日期,顾客姓名 from `全国订单明细`;

# 带有排序子句的基本查询 使用Order子句对订单号进行排序 使用默认排序方式
SELECT 订单号,订单日期,顾客姓名,`订单数量` from `全国订单明细` ORDER BY `订单号`;

# 修改订单数量字段的数据类型.原本是字符串类型改成数值类型
alter table `全国订单明细` MODIFY 订单号 INT(11) ;

# 查看表结构
desc `全国订单明细`;

# 带有排序子句的基本查询 使用Order子句对订单号进行排序 使用降序排列
SELECT 订单号,订单日期,顾客姓名,`订单数量` from `全国订单明细` ORDER BY `订单号` DESC;

# 查看顾客姓名为孟红飞的所有订单 使用where子句添加匹配条件
SELECT 订单号,订单日期,顾客姓名,`订单数量` from `全国订单明细` WHERE 顾客姓名 = '孟红飞';

# 聚合函数和分组的使用.求不同等级订单的总数
select count(订单号) as 订单总数,订单等级 from `全国订单明细` group BY `订单等级`;

# 聚合函数和分组的使用.求不同等级订单的总数.然后再按照订单总数进行降序排列
select count(订单号) as 订单总数,订单等级 from `全国订单明细` group BY `订单等级` order by count(`订单号`) DESC;

# 求最高的销售额
select MAX(销售额) 销售额最大值 from `全国订单明细`;

# 求最小的销售额
select min(销售额) 销售额最小值 from `全国订单明细`;

# 求销售额的平均值
select avg(销售额) 销售额平均值 from `全国订单明细`;

# 求不同区域的销售额总和
select sum(销售额) AS 总销售额,区域 from `全国订单明细` GROUP BY 区域;

# 求不同区域的销售额总和 对结果进行筛选 要求大于 所有区域销售额的平均值
select sum(销售额) AS 总销售额,区域 from `全国订单明细` GROUP BY 区域;

# 第一步先加筛选的语句
select sum(销售额) AS 总销售额,区域 from `全国订单明细` GROUP BY 区域 having sum(销售额) > 3000000
# 第二步求所有区域销售额平均值
select avg(销售额) from `全国订单明细`;
# 第三步 使用子查询给外层查询提供数据 把第一步和第二步合并
select sum(销售额) AS 总销售额,区域 from `全国订单明细` GROUP BY 区域 having sum(销售额) > (select max(销售额) from `全国订单明细`);

# 练习一:求运输成本最低的运输方式
# 练习二:求东北区域销售额最高的省
# 练习三:求利润最高的产品





