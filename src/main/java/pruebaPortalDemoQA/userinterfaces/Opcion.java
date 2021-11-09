package pruebaPortalDemoQA.userinterfaces;

public enum Opcion {
  SeleccionaTuViaje("https://demoqa.com/");

  private final String url;

  Opcion(String url) {
    this.url = url;
  }

  public String url() {
    return url;
  }
}
