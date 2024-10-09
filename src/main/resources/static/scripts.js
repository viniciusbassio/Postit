document.getElementById('newPostIt').addEventListener('click', function () {
    const board = document.getElementById('board');

    // Cria um novo post-it
    const postIt = document.createElement('div');
    postIt.className = 'post-it';

    // Adiciona um textarea
    const textarea = document.createElement('textarea');
    postIt.appendChild(textarea);

    // Botão para remover o post-it
    const closeBtn = document.createElement('button');
    closeBtn.className = 'close-btn';
    closeBtn.innerHTML = 'X';
    closeBtn.addEventListener('click', function () {
        board.removeChild(postIt);
    });
    postIt.appendChild(closeBtn);

    // Adiciona o post-it ao quadro
    board.appendChild(postIt);
});
