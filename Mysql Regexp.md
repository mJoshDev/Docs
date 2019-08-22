>**Mysql Regexp learn**
---
*Mysql 支持正则表达式，但不支持简写，如数字：[0-9] 替代 \d*
   
示例：`select mobile from tab1 where mobile regexp '^138[0-9]{8}'`

mobile|
--|
13873671271|
13838282210|

匹配包含某个字符等价于like '%XX%'

示例：`select name from usr where name regexp 'XX'`

name|
--|
AXXB|
SXXKA|
XX1|

匹配指定字符开头的数据(以XX)

示例：`select name from usr wher name regexp '^XX'`

name|
--|
XX1|
XX2|
   
[参考自Runoob mysql regexp](https://www.runoob.com/mysql/mysql-regexp.html)