# JFXGobang
JavaFX Application应用实例 一个五子棋游戏，能实现双方黑白对决，当一方获胜时给出提示信息，利用GUI界面实现

项目结构图

![项目结构](C:\Users\Lee\Desktop\项目结构.png)



**一、实体**

FiveChess类

- 提供五子棋实体包含的所有信息
- 判断游戏是否结束
- play方法改变chess[][]棋盘中的数据

**二、视图**

ChessPane类继承Pane类实现棋盘和五子棋的绘制

**三、控制器**

playAction类继承自事件处理器EventHandler并传递的参数是鼠标事件，表示接受鼠标点击面板事件

 **四、启动类**



![界面效果](C:\Users\Lee\Desktop\界面效果.png)