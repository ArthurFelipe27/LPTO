public class CategoriaDeProdutos {
    private int codigoProduto;

    public CategoriaDeProdutos(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }
        public void escolherCategoria(int codigoProduto){
            String categoria;
            switch (codigoProduto){
                case 1:
                    categoria = "Eletrônicos";
                    break;
                case 2:
                    categoria = "Alimentos";
                    break;
                case 3:
                    categoria = "Brinquedos";
                    break;
                default:
                    categoria = "Roupas";
            }
        }

    }
