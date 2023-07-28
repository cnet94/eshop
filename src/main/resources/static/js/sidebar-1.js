function showMenu(menuName) {
    // ������� � ���������� ���� � ���������������� ��������
    const menu1Items = ["������� 1", "������� 2", "������� 3"];
    const menu1Links = ["#", "https://example.com/2", "https://example.com/3"];
    const menu2Items = ["����� 1", "����� 2", "����� 3"];
    const menu2Links = ["https://example.com/4", "https://example.com/5", "https://example.com/6"];
    const menu3Items = ["Item 1", "Item 2", "Item 3"];
    const menu3Links = ["https://example.com/7", "https://example.com/8", "https://example.com/9"];

    // ������� ���������� �������� �������
    document.getElementById('menuContent').innerHTML = '';

    // ����������, ����� ���� ���� �������, � ������� ��� �������� �� ������ ������� �������
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

    // ��������� ������ ��������� ���� �� ������ �������
    const menuList = document.createElement('ul');
    menuList.className = 'list-group';
    selectedMenuItems.forEach((item, index) => {
        const menuItem = document.createElement('li');
        menuItem.className = 'list-group-item';
        const link = document.createElement('a');
        link.href = selectedMenuLinks[index]; // ����� ��������� ������ ��� ������� ������ ����
        link.textContent = item;
        menuItem.appendChild(link);
        menuList.appendChild(menuItem);
    });

    // ��������� ������ ��������� ���� �� ������ �������
    document.getElementById('menuContent').appendChild(menuList);
}