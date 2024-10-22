//Codevita 2024
//Cisterna d'água
//Evandro José Graton

import java.util.Scanner;
import java.time.*;
import java.time.format.*;

public class WaterCistern {

  private int r = 0, h = 0, s = 0, d = 0, g = 0;
  private Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    new WaterCistern().execute();
  }

  public void execute() {

    //Realiza a obtenção e validação das variáveis
    entrada_rhs();
    entrada_dg();

    //Registra o inicio do calculo
    ZonedDateTime t0 = ZonedDateTime.now();

    double menorDistancia = (d < 0)
      ? caminhoPeloTopo()   //Se o destino estiver na superficie plana do topo, retorna o trajeto mais curto entre ir pela superficie curva ou ir pelo topo
      : caminhoCurvo(d, g); //Se o destino estiver na superficie curva, o trajeto mais curto será sempre pela superficie curva

    System.out.printf("Saida\n\r%d\n\n\r", Math.round(menorDistancia));

    //Calcula o tempo de processamento entre t0 e agora e apresenta em fracao de segundos
    System.out.println("Processamento (s): " + Duration.between(t0, ZonedDateTime.now()).toMillis()/1000.0);
  
  }

  private void entrda_rhs() {
    
  }

  private void entrada_dg() {
    
  }
    
}
