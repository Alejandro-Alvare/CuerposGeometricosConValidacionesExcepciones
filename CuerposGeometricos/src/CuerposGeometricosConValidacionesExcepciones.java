
import java.util.InputMismatchException;
import java.util.Scanner;


public class CuerposGeometricosConValidacionesExcepciones {
    public static void main(String[] args)throws Exception  {
             Scanner lector = new Scanner(System.in);

              
              int opc = 0;
              
        do {
            System.out.println("Seleccione una figura geometrica:");
            System.out.println("1.  Prisma: ");
            System.out.println("2.  Cilindro: ");
            System.out.println("3.  Piramide: ");
            System.out.println("4.  Cono: ");
            System.out.println("5.  Esfera: ");
            System.out.println("6.  Zona esferica: ");
            System.out.println("7.  Casquete esferico: ");
            System.out.println("8.  Cuña esferica: ");
            System.out.println("9.  Ortodero: ");
            System.out.println("10. Tetraedro: ");
            System.out.println("11. Hexaedro: ");
            System.out.println("12. Octaedro: ");
            System.out.println("13. Dodecaedro: ");
            System.out.println("14. Icosaedro: ");
            System.out.println("15. Tronco de cono: ");
            System.out.println("16. Tronco de piramide: ");
            System.out.println(  "17. Salir: ");
            opc = lector.nextInt();

           
    try {
        
      switch (opc) {
                 case 1:
                    ResolverAreaPrima();
                    break;
                   
                case 2:
                    ResolverVolumenCilindro();
                    break;

                case 3:
                    ResolverVolumenPiramide();
                    break;

                case 4:
                    ResolverVolumenCono();
                    break;

                case 5:
                    ResolverVolumenEsfera();
                    break;

                 case 6:
                    ResolverAreaZonaEsferica();
                    break;

                case 7:
                    ResolverVolumenCasqueteEsferico();
                    break;

                case 8:
                    ResolverVolumenCunaEsferica();
                    break;

                case 9:
                    ResolverVolumenOrtoedro();
                    break;

                case 10:
                    ResolverVolumenTetraedro();
                    break;

                case 11:
                    ResolverVolumenHexaedro();
                    break;

                case 12:
                    ResolverVolumenOctaedro();
                    break;

                case 13:
                    ResolverVolumenDodecaedro();
                    break;

                 case 14:
                    ResolverVolumenIcosaedro();
                    break;  

                case 15:
                    ResolverVolumenTroncoCono();
                    break;

                case 16:
                    ResolverVolumenTroncoPiramide();
                    break;
                
                case 17:
                    System.out.println("Salir");
                    break;

                default:
                    System.out.println("Eleccion invalida");
                    break;
            }
    }    catch (InputMismatchException e) {
        
        System.out.println("Ingrese un número válido.");
        lector.nextLine();
    }
        
        } while (opc != 17);
    }

     public static void ResolverAreaPrima() {
        Scanner Input = new Scanner(System.in);
        System.out.println("Digite la longitud de las aristas: ");
        double LGA = Input.nextDouble();
        if (LGA > 0) {
            double area = 5 * Math.sqrt(3) * Math.pow(LGA, 2);
            System.out.println("El area de la prima es: " + area);
        } else {
            throw new ArithmeticException("Los valores NO deben ser negativos!");
        }
    
    }


     public static void ResolverVolumenCilindro() {
        Scanner Input = new Scanner(System.in);
        System.out.println("Digite el radio: ");
        double r = Input.nextDouble();
        System.out.println("Digite la altura: ");
        double h = Input.nextDouble();
        if (r > 0 && h > 0) {
            double volumen = Math.PI * Math.pow(r, 2) * h;
            System.out.println("El volumen del cilindro es: " + volumen);
        } else {
            throw new ArithmeticException("Los valores deben ser positivos!");
        }
    }




     public static void ResolverVolumenPiramide() {
        Scanner Input = new Scanner(System.in);
        System.out.println("Digite la base: ");
        double b = Input.nextDouble();
        System.out.println("Digite la altura: ");
        double h = Input.nextDouble();
        if (b > 0 && h > 0) {
            double volumen = (b * b * h) / 3;
            System.out.println("El volumen de la piramide es: " + volumen);
        } else {
            throw new ArithmeticException("Los valores NO deben ser negativos!");
        }
    }


    

    public static void ResolverVolumenCono() {
        Scanner Input = new Scanner(System.in);
        System.out.println("Digite el radio: ");
        double r = Input.nextDouble();
        System.out.println("Digite la altura: ");
        double h = Input.nextDouble();
        if (r > 0 && h > 0) {
            double volumen = (1.0 / 3.0) * Math.PI * Math.pow(r, 2) * h;
            System.out.println("El volumen del cono es: " + volumen);
        } else {
            throw new ArithmeticException("Los valores NO deben ser negativos!");
        }
    }

    public static void ResolverVolumenEsfera() {
        Scanner Input = new Scanner(System.in);
        System.out.println("Digite el radio: ");
        double r = Input.nextDouble();
        if (r > 0) {
            double volumen = (4 / 3) * Math.PI * Math.pow(r, 3);
            System.out.println("El volumen de la esfera es: " + volumen);
        } else {
            throw new ArithmeticException("Los valores deben ser positivos!");
        }
    }


    public static void ResolverAreaZonaEsferica() {
        Scanner Input = new Scanner(System.in);
        System.out.println("Digite el radio: ");
        double r = Input.nextDouble();
        System.out.println("Digite el angulo: ");
        double Ang = Input.nextDouble();
        if (r > 0 && Ang > 0 && Ang < 360) {
            double area = 2 * Math.PI * r * r * (Ang / 360);
            System.out.println("El area de la zona esferica es: " + area);
        } else {
            throw new ArithmeticException("Los valores NO deben ser negativos y los grados de 0 - 360!");
        }
    }

    public static void ResolverVolumenCasqueteEsferico() {
        Scanner Input = new Scanner(System.in);
        System.out.println("Digite el radio: ");
        double r = Input.nextDouble();
        System.out.println("Digite la altura: ");
        double h = Input.nextDouble();
        if (r > 0 && h > 0) {
            double volumen = (Math.PI / 6) * h * (3 * r * r + h * h);
            System.out.println("El volumen del casquete esferico es: " + volumen);
        } else {
           throw new ArithmeticException("Los valores NO deben ser negativos!");
        }
    }

    public static void ResolverVolumenCunaEsferica() {
        Scanner Input = new Scanner(System.in);
        System.out.println("Digite el radio: ");
        double r = Input.nextDouble();
        System.out.println("Digite la altura: ");
        double h = Input.nextDouble();
        if (r > 0 && h > 0) {
            double volumen = (Math.PI / 6) * h * (3 * r * r - h * h);
            System.out.println("El volumen de la cuna esferica es: " + volumen);
        } else {
            throw new ArithmeticException("Los valores deben ser positivos!");
        }
    }

    public static void ResolverVolumenOrtoedro() {
        Scanner Input = new Scanner(System.in);
        System.out.println("Digite la longitud: ");
        double longitud = Input.nextDouble();
        System.out.println("Digite lo ancho: ");
        double Anc = Input.nextDouble();
        System.out.println("Digite la altura: ");
        double h = Input.nextDouble();
        if (longitud > 0 && Anc > 0 && h > 0) {
            double volumen = longitud * Anc * h;
            System.out.println("El volumen del ortoedro es: " + volumen);
        } else {
            throw new ArithmeticException("Los valores NO deben ser negativos!");
        }
    }

    public static void ResolverVolumenTetraedro() {
        Scanner Input = new Scanner(System.in);
        System.out.println("Digite la longitud del lado: ");
        double LGL = Input.nextDouble();
        if (LGL > 0) {
            double volumen = (Math.sqrt(2) / 12) * LGL * LGL * LGL;
            System.out.println("El volumen del tetraedro es: " + volumen);
        } else {
            throw new ArithmeticException("Los valores NO deben ser negativos!");
        }
    }

    public static void ResolverVolumenHexaedro() {
        Scanner Input = new Scanner(System.in);
        System.out.println("Digite la longitud del lado: ");
        double LGL = Input.nextDouble();
        if (LGL > 0) {
            double volumen = LGL * LGL * LGL;
            System.out.println("El volumen del hexaedro es: " + volumen);
        } else {
            throw new ArithmeticException("Los valores NO deben ser negativos!");
        }
    }

    public static void ResolverVolumenOctaedro() {
        Scanner Input = new Scanner(System.in);
        System.out.println("Digite la longitud del lado: ");
        double LGL = Input.nextDouble();
        if (LGL > 0) {
            double volumen = (Math.sqrt(2) / 3) * LGL * LGL * LGL;
            System.out.println("El volumen del octaedro es: " + volumen);
        } else {
            throw new ArithmeticException("Los valores NO deben ser negativos!");
        }
    }


    public static void ResolverVolumenDodecaedro() {
        Scanner Input = new Scanner(System.in);
        System.out.println("Digite la longitud del lado: ");
        double LGL = Input.nextDouble();
        if (LGL > 0) {
            double volumen = ((15 + 7 * Math.sqrt(5)) / 4) * LGL * LGL * LGL;
            System.out.println("El volumen del dodecaedro es: " + volumen);
        } else {
            throw new ArithmeticException("Los valores NO deben ser negativos!");
        }
    }

    public static void ResolverVolumenIcosaedro() {
        Scanner Input = new Scanner(System.in);
        System.out.println("Digite la longitud del lado: ");
        double LGL = Input.nextDouble();
        if (LGL > 0) {
            double volumen = (5 / 12) * (3 + Math.sqrt(5)) * LGL * LGL * LGL;
            System.out.println("El volumen del icosaedro es: " + volumen);
        } else {
            throw new ArithmeticException("Los valores NO deben ser negativos!");
        }
    }

    public static void ResolverVolumenTroncoCono() {
        Scanner Input = new Scanner(System.in);
        System.out.println("Digite el radio mayor: ");
        double RM = Input.nextDouble();
        System.out.println("Digite el radio menor: ");
        double rm = Input.nextDouble();
        System.out.println("Digite la altura: ");
        double h = Input.nextDouble();
        if (RM > 0 && rm > 0 && h > 0) {
            double volumen = (Math.PI / 3) * h * (Math.pow(RM, 2) + RM * rm + Math.pow(rm, 2));
            System.out.println("El volumen del tronco de cono es: " + volumen);
        } else {
           throw new ArithmeticException("Los valores NO deben ser negativos!");
        }
    }

    public static void ResolverVolumenTroncoPiramide() {
        Scanner Input = new Scanner(System.in);
        System.out.println("Digite el area base mayor: ");
        double ABM = Input.nextDouble();
        System.out.println("Digite el area base menor: ");
        double abm = Input.nextDouble();
        System.out.println("Digite la altura: ");
        double h = Input.nextDouble();
        if (ABM > 0 && abm > 0 && h > 0) {
            double volumen = (h / 3) * (ABM + abm + Math.sqrt(ABM * abm));
            System.out.println("El volumen del tronco de piramide es: " + volumen);
        } else {
            throw new ArithmeticException("Los valores NO deben ser negativos!");
        }
    
    
    
    
    }

 
 

}