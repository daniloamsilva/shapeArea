public int shapeArea(int n) {
    // O resultado começa com 1 representando o centro do poligono.
    private int result = 1;
    
    // Esse cálculo representa os eixos vertical e horizontal a partir do centro.
    result += (n - 1) * 4;
    
    // O laço vai calcular as diagonais que vai aumentando de acordo com o tamanho do poligono.
    // Percebi que subtraindo por 2 você encontra o "tamanho" do eixo diagonal,
    // então multiplico por 4 para calcular todas as direções.
    // Refaço o processo até preencher o desenho.
    while( n > 2) {
        result += (n - 2) * 4;
        n--;
    }
    
    // No final, retorno o resultado.
    return result;
}