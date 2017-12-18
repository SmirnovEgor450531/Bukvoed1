# Требование к проекту
## 1. Введение
Разрабатываемое приложения имеет название   “Буквоед!” . Оно предназначено для обучения пользователя слепому вводу текста с клавиатуры, которое может помочь
 каждому человеку в обучении, тренировках и совершенствовании навыков печати. Приложение должно обеспечить для пользователя такие функции как: Поле набираемого 
текста заполняет сам пользователь , что означает текст может быть на любом языке и так же любой сложности , отображение статистики по окончанию ввода (Время 
затраченное на ввод, расчёт по формуле кол-во введённых символов в минуту + кол-во введённых слов в минуту, определение сложности вводимого текста). В данном 
приложении отсутствует выбор вводимого текста , отображение ошибок , сохранение статистики и так же многопользовательский режим. Приложение ориентировано на 
начинающих пользователей пк и желающих усовершенствовать свои навыки и скорость ввода текста с клавиатуры.
---
# 2. Требования пользователя
# 2.1 Программные интерфейсы
Приложение расчитано на кроссплатформенность ,т.е. будет поддерживать такие ОС как :  Windows, Linux, macOS. 
Язык , с помощью которого будет реализовано приложение , является - java.

## 2.2 Интерфейс пользователя
Приложение имеет графический интерфейс и на основе этого взаимодействует с пользователем.   (Смотреть Mockups).

## 2.3 Характеристики пользователей
Приложение ориентировано на пользователей, которые начинают осваивать пк или хотят повысить свой уровень скоростной и правильной печати (школьники, студенты, 
пенсионеры).

## 2.4 Предложения и зависимости
На требования данного приложения может повлиять  мнение пользователей, в ходе тестирования продукта.

# 3 Системные требования
Для приложения требуется наличие установленного Java Version 8 Update 151 , так как запускаемый файл имеет расширение .jar. Ограничений по используемой памяти нет.

## 3.1 Функциональные требования
### 3.1.1
Организовать поле  для текста,который был определён пользователем.( Максимальный размер которого : 140 символов). (См Mockups. "Поле # 1")

### 3.1.2 
Организовать поле  для ввода текста,который был определён пользователем.( Максимальный размер которого : 140 символов). (См Mockups. "Поле # 2")

### 3.1.3 
Организовать таймер , который после нажатии кнопки "Begin" будет отображать время затраченное на ввод желаемого текста в секундах в Поле #2 . (Смотреть Mockups).

### 3.1.4
Организовать обработку статистики и вывод её на экран пользователю ,а именно : 1)Кол-во введённых символов в минуту 2)Кол-во введённых слов в минуту 3)Кол-во ошибок 4)Итоговая оценка (Хорошо,средне,плохо)

### 3.1.5
Организовать при нажатии кнопки "Tutorial" получение пошаговой инструкции работы с приложением.

## 3.2 Нефункциональные требования

### 3.2.1 Безопасность 
Приложение не должно использовать некие методы для шифрования информации, так как данные доступны всем пользователям, имеющим права на запуск приложения.

### 3.2.2 Удобство использования
Для начинающих пользователей продумана инструкция , в которой прописано по шагам ход работы с приложением. (Смотреть Mockups).

### 3.2.3 Переносимость
Все необходимые для правильной работы приложения сторонние расширения должны поставляться вместе с ним. Приложение работает с системами имеющими Java Version 8 
Update 151.

