function openForm(id) {
    // 0 -> Обща информация
    if (id === 0) {
        // You could replace it with FOR loop
        document.getElementById("myForm").style.display = "block";
        document.getElementById("bee-farm").style.display = "none";
        document.getElementById("my-publications").style.display = "none";
        document.getElementById("my-comment").style.display = "none";
        document.getElementById("settings").style.display = "none";

        // 1 -> Моите пчелини
    } else if (id === 1) {
        document.getElementById("myForm").style.display = "none";
        document.getElementById("my-publications").style.display = "none";
        document.getElementById("my-comment").style.display = "none";
        document.getElementById("settings").style.display = "none";
        document.getElementById("bee-farm").style.display = "block";

        // 2 -> Моите теми (публикации)
    } else if (id === 2) {
        document.getElementById("my-publications").style.display = "block";
        document.getElementById("myForm").style.display = "none";
        document.getElementById("bee-farm").style.display = "none";
        document.getElementById("my-comment").style.display = "none";
        document.getElementById("settings").style.display = "none";

        // 3 -> Моите коментари
    } else if (id === 3) {
        document.getElementById("my-publications").style.display = "none";
        document.getElementById("myForm").style.display = "none";
        document.getElementById("bee-farm").style.display = "none";
        document.getElementById("my-comment").style.display = "block";
        document.getElementById("settings").style.display = "none";

        // 4 -> Настройки
    } else if (id === 4) {
        document.getElementById("my-publications").style.display = "none";
        document.getElementById("myForm").style.display = "none";
        document.getElementById("bee-farm").style.display = "none";
        document.getElementById("my-comment").style.display = "none";
        document.getElementById("settings").style.display = "block";
    }
}
