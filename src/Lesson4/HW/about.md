Волновой алгоритм можно назвать одним из самых уникальных алгоритмов трассировки. Он позволяет сформировать путь
 (трассу) между двумя ключевыми точками (элементами) в любом лабиринте.
Исходные данные, цели и задачи, которые требуются для работы волнового алгоритма можно кратко сформулировать 
следующим образом:
- Волновой алгоритм решает задачу нахождения (поиска) пути на плоской двумерной клетчатой карте. 
- Каждой клетке карты присваивается одно из двух состояний «пустая» и «препятствие», также выбираются клетки 
«начала» и «конца» пути.
- Цель волнового алгоритма - это задача прокладывания или нахождения пути на карте между начальной, конечной точкой.

Работа алгоритма включает в себя три этапа: инициализацию, распространение волны и восстановление пути.

Во время инициализации строится образ множества ячеек обрабатываемого поля, каждой ячейке приписываются атрибуты 
проходимости/непроходимости, запоминаются стартовая и финишная ячейки.
Далее, от стартовой ячейки порождается шаг в соседнюю ячейку, при этом проверяется, проходима ли она, и не принадлежит 
ли ранее меченной в пути ячейке. Соседние ячейки принято классифицировать двояко: в смысле окрестности Мура и 
окрестности фон Неймана, отличающийся тем, что в окрестности фон Неймана соседними ячейками считаются 
только 4 ячейки по вертикали и горизонтали, в окрестности Мура — все 8 ячеек, включая диагональные.
При выполнении условий проходимости и непринадлежности её к ранее помеченным в пути ячейкам, в атрибут ячейки 
записывается число, равное количеству шагов от стартовой ячейки, от стартовой ячейки на первом шаге это будет 1. 
Каждая ячейка, меченная числом шагов от стартовой ячейки, становится стартовой и из неё порождаются очередные 
шаги в соседние ячейки. Очевидно, что при таком переборе будет найден путь от начальной ячейки к конечной, 
либо очередной шаг из любой порождённой в пути ячейки будет невозможен.
Восстановление кратчайшего пути происходит в обратном направлении: при выборе ячейки от финишной ячейки к стартовой 
на каждом шаге выбирается ячейка, имеющая атрибут расстояния от стартовой на единицу меньше текущей ячейки. 
Очевидно, что таким образом находится кратчайший путь между парой заданных ячеек[6]. 
Трасс с минимальной числовой длиной пути, как при поиске пути в окрестностях Мура, так и фон Неймана может существовать 
несколько. Выбор окончательного пути в приложениях диктуется другими соображениями, находящимися вне этого алгоритма. 
Например, при трассировке печатных плат — минимумом линейной длины проложенного проводника.

Кратчайший путь до выхода, если таковых несколько, можно найти создав для каждой точки выхода свой вариант заполненной 
карты и выбрать кратчайший путь.