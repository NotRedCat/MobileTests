[![Typing SVG](https://readme-typing-svg.herokuapp.com?font=Fira+Code&size=18&duration=10000&pause=1000&color=2685AF&width=1000&height=40&lines=%D0%9F%D1%80%D0%B8%D0%B2%D0%B5%D1%82!+%D0%AD%D1%82%D0%BE+%D0%BC%D0%BE%D0%B9+%D0%B4%D0%B8%D0%BF%D0%BB%D0%BE%D0%BC%D0%BD%D1%8B%D0%B9+%D0%BF%D1%80%D0%BE%D0%B5%D0%BA%D1%82+%D0%BF%D0%BE+%D0%B0%D0%B2%D1%82%D0%BE%D1%82%D0%B5%D1%81%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D1%8E+%D0%BC%D0%BE%D0%B1%D0%B8%D0%BB%D1%8C%D0%BD%D0%BE%D0%B3%D0%BE+%D0%BF%D1%80%D0%B8%D0%BB%D0%BE%D0%B6%D0%B5%D0%BD%D0%B8%D1%8F.;%D0%B0%D0%B2%D1%82%D0%BE%D1%82%D0%B5%D1%81%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D1%8E+%D0%BC%D0%BE%D0%B1%D0%B8%D0%BB%D1%8C%D0%BD%D0%BE%D0%B3%D0%BE+%D0%BF%D1%80%D0%B8%D0%BB%D0%BE%D0%B6%D0%B5%D0%BD%D0%B8%D1%8F.)](https://git.io/typing-svg)
<div>
<img src="https://media.giphy.com/media/8VkgrPdxMh0oo/giphy.gif" width="300px"/>
</div>

### :green_book: About Me :
---
- Использованный стек 

- Как запустить тесты

- Видео запуска одного из тестов

### :hammer_and_wrench: Использованный стек :
---
<div>
<img src="https://raw.githubusercontent.com/devicons/devicon/1119b9f84c0290e0f0b38982099a2bd027a48bf1/icons/androidstudio/androidstudio-original.svg" width="50px"/>
<img src="https://seeklogo.com/images/A/appium-logo-7A2DD5B4E3-seeklogo.com.png" width="50px"/>
<img src="https://www.svgrepo.com/show/303388/java-4-logo.svg" width="50px"/>
<img src="https://upload.wikimedia.org/wikipedia/commons/thumb/f/f4/IntelliJ_IDEA_Edu_Icon.svg/640px-IntelliJ_IDEA_Edu_Icon.svg.png" width="50px"/>
<img src="https://cdn.iconscout.com/icon/free/png-256/gradle-2-1174969.png" width="50px"/>
<img src="https://assets-global.website-files.com/5f10ed4c0ebf7221fb5661a5/5f23a7a9b70a249eed481481_Junit.png" width="50px"/>
<img src="https://upload.wikimedia.org/wikipedia/commons/9/91/Octicons-mark-github.svg" width="50px"/>
<img src="https://molecula.gallerycdn.vsassets.io/extensions/molecula/allure-test-reports/1.1/1474455326332/Microsoft.VisualStudio.Services.Icons.Default" width="50px"/>
<img src="https://raw.githubusercontent.com/lmaslo/Wikipedia-Mobile-Tests/8c161f04ad17515a721a1ad5de1de4b599ba4839/images/logo/Selenide.svg" width="50px"/>
</div>

### :rocket: Как запустить тесты :
---
- Запустить в эмуляторе

1) Запустить в AndroidStudio эмулятор Pixel 4 
2) Запусть Appium сервер
3) Ввести в командную строку терминала команду
```javascript
gradle clean test -DdeviceHost=local
```

- Запустить на реальном устройстве
1) Подключить реальное устройство для отладки
2) Запусть Appium сервер
3) Изменить в файле realMobile.properties значения переменных device и os_version, на параметры вашего реального устройства
4) Ввести в командную строку терминала команду

```javascript
gradle clean test -DdeviceHost=local
```

