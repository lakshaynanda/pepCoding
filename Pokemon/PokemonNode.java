
public class PokemonNode {

  private Pokemon data;
  private PokemonNode leftChild;
  private PokemonNode rightChild;

  public PokemonNode(Pokemon data) {
    this.data = data;
    this.leftChild = null;
    this.rightChild = null;
    if (data == null) {
      throw new IllegalArgumentException();
    }
  }

  public PokemonNode getLeftChild() {
    return leftChild;
  }

  public PokemonNode getRightChild() {
    return rightChild;
  }

  public Pokemon getPokemon() {
    return data;
  }

  public void setLeftChild(PokemonNode left) {
    this.leftChild = left;
  }

  public void setRightChild(PokemonNode right) {
    this.rightChild = right;
  }
}
