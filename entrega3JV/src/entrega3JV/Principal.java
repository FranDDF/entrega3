package entrega3JV;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String opcion, cbu;
		String miCbu = "0000007916567895632981";
		double retiro, deposito, transf;
		deposito = 0;
		double saldo = 10000;

				System.out.println("Bienvenido al cajero.");
				
				do {
					System.out.println("Menú: ");
					System.out.println("Opción 1. Ingresar importe a depositar");
					System.out.println("Opción 2. Consultar saldo actual");
					System.out.println("Opción 3. Ingresar saldo a retirar");
					System.out.println("Opción 4. Transferir saldo");
					System.out.println("Opción 5. Consulta de CBU");
					System.out.println("Opción 0. Finalizar");
					opcion = in.next();

					switch (opcion) {
					case "1":
						System.out.println(
								"Por favor, ingrese el importe a depositar. Debe ser múltiplo de 100 y mayor o igual a $1000: ");
						deposito = in.nextDouble();

						if (deposito % 100 == 0 && deposito >= 1000) {
							System.out.println("Su saldo actual es de $" + (saldo + deposito)
									+ " Pulse cualquier tecla para volver al menú principal.");
							in.next();
						} else {
							System.out.println("Importe incorrecto. Será redirigido al menú principal.");
						}
						break;

					case "2":
						saldo += deposito;
						System.out.println("Su saldo actual es de $" + saldo
								+ ". Pulse cualquier tecla para volver al menú principal.");
						in.next();
						break;

					case "3":
						System.out.println(
								"Por favor, ingrese el importe a retirar. Debe ser múltiplo de 100 y mayor o igual a $1000: ");
						retiro = in.nextDouble();

						if (retiro % 100 == 0 && retiro >= 1000) {
							saldo -= retiro;
							System.out.println("Su saldo actual es de $" + saldo
									+ ". Pulse cualquier tecla para volver al menú principal.");
							in.next();
						} else {
							System.out.println("Importe incorrecto. Será redirigido al menú principal.");
						}
						break;
						
					case "4":
						System.out.println("Por favor, ingrese el importe a transferir");
						transf = in.nextDouble();
						System.out.println("Por favor, indique el CBU al cual realizará la transferencia");
						cbu = in.next();
						saldo -= transf;
						System.out.println("Transferencia realizada. Su saldo actual es de $" + saldo
								+ ". Pulse cualquier tecla para volver al menú principal.");
						in.next();
						break;
						
					case "5":
						System.out.println("Su cbu es: " + miCbu + ". Pulse cualquier tecla para volver al menú principal.");
						in.next();
						break;
						
					case "0":
						System.out.println("FIN");
						opcion = "0";
						break;

					default:
						System.out.println("Opción incorrecta. Será redirigido al menú principal.");
						break;
					}
				} while (!opcion.equals("0"));

	}

}
