function showMenu(menuName) {
    // Массивы с элементами меню и соответствующими ссылками
    const menu1Items = ["Элемент 1", "Элемент 2", "Элемент 3"];
    const menu1Links = ["#", "https://example.com/2", "https://example.com/3"];
    const menu2Items = ["Пункт 1", "Пункт 2", "Пункт 3"];
    const menu2Links = ["https://example.com/4", "https://example.com/5", "https://example.com/6"];
    const menu3Items = ["Item 1", "Item 2", "Item 3"];
    const menu3Links = ["https://example.com/7", "https://example.com/8", "https://example.com/9"];

    // Очищаем содержимое среднего столбца
    document.getElementById('menuContent').innerHTML = '';

    // Определяем, какое меню было выбрано, и выводим его элементы во втором столбце списком
    let selectedMenuItems;
    let selectedMenuLinks;
    switch (menuName) {
        case 'menu1':
            selectedMenuItems = menu1Items;
            selectedMenuLinks = menu1Links;
            break;
        case 'menu2':
            selectedMenuItems = menu2Items;
            selectedMenuLinks = menu2Links;
            break;
        case 'menu3':
            selectedMenuItems = menu3Items;
            selectedMenuLinks = menu3Links;
            break;
        default:
            return;
    }

    // Формируем список элементов меню во втором столбце
    const menuList = document.createElement('ul');
    menuList.className = 'list-group';
    selectedMenuItems.forEach((item, index) => {
        const menuItem = document.createElement('li');
        menuItem.className = 'list-group-item';
        const link = document.createElement('a');
        link.href = selectedMenuLinks[index]; // Здесь добавляем ссылку для каждого пункта меню
        link.textContent = item;
        menuItem.appendChild(link);
        menuList.appendChild(menuItem);
    });

    // Вставляем список элементов меню во второй столбец
    document.getElementById('menuContent').appendChild(menuList);
}