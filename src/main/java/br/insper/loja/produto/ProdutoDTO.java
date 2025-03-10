package br.insper.loja.produto;

record CadastraProdutoDTO(String nome, Float preco, Integer estoque) {
}

record RetornarProdutoDTO(String id, String nome, Float preco, Integer estoque) {
}

record EditarProdutoDTO(String nome, Float preco, Integer estoque) {
}
