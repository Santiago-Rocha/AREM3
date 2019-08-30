# Laboratorio 3
Este proyecto ofrece diferentes ejemplos para interactuar con clientes y servicios en Java


## Prerrequisitos
Es necesario tener instalado Java 1.8 y Apache Maven 3.6.0


## Ejecutar
### Descagar dependencias y compilar
```
mvn package
```
#### URLReader
```
java -cp target\ClientServiceApp-1.0-SNAPSHOT.jar edu.escuelaing.arem.URLReader
```
#### Sockets - Cuadrado
Primero se debe prender el servidor con el siguiente comando
```
java -cp target\ClientServiceApp-1.0-SNAPSHOT.jar edu.escuelaing.arem.Cuadrado.EchoServer
```
Luego prender el cliente con el siguiente comando
```
java -cp target\ClientServiceApp-1.0-SNAPSHOT.jar edu.escuelaing.arem.Cuadrado.EchoClient
```
![image](https://user-images.githubusercontent.com/13685178/63990250-f679ba80-caa8-11e9-92b8-8267eba9cc88.png)
#### Sockets - Trigonometria
Primero se debe prender el servidor con el siguiente comando
```
java -cp target\ClientServiceApp-1.0-SNAPSHOT.jar edu.escuelaing.arem.Trigonometricas.EchoServer
```
Luego prender el cliente con el siguiente comando
```
java -cp target\ClientServiceApp-1.0-SNAPSHOT.jar edu.escuelaing.arem.Trigonometricas.EchoClient
```
el servidor esta esperando que el cliente le envié un numero  y responder con el el sen, cos o tan de ese valor, en caso de ser una cadena espera que sea de la forma fun:[:funcion trigonometrica] 
![image](https://user-images.githubusercontent.com/13685178/63990926-6be68a80-caab-11e9-837c-bfa2952a3564.png)

#### HttpServer
```
java -cp target\ClientServiceApp-1.0-SNAPSHOT.jar edu.escuelaing.arem.HttpServer
```
Luego de ejecutar el comando debe dirigirse a [http://localhost:35000/index.html](http://localhost:35000/index.html) para ver el funcionamiento

![enter image description here](https://user-images.githubusercontent.com/13685178/51884735-8bbba180-2356-11e9-9de8-e885267cb6b8.png)

#### DataGramas
Primero se debe prender el servidor con el siguiente comando
```
java -cp target\ClientServiceApp-1.0-SNAPSHOT.jar edu.escuelaing.arem.Datagramas.DatagramTimeServer
```
Luego prender el cliente con el siguiente comando
```
java -cp target\ClientServiceApp-1.0-SNAPSHOT.jar edu.escuelaing.arem.Datagramas.DatagramTimeClient
```
> Primero  el cliente solicita y el servidor responde 
![image](https://user-images.githubusercontent.com/13685178/63990616-4a38d380-caaa-11e9-910d-96449b7fb04b.png)

> Cuando el servidor es apagado el cliente mantiene la ultima hora que el servidor le entrego
![image](https://user-images.githubusercontent.com/13685178/63990634-5c1a7680-caaa-11e9-96bf-7b74b308fd84.png)

> Finalmente cuando el servidor se enciende nuevamente el cliente vuelve a acualizar su hora

![image](https://user-images.githubusercontent.com/13685178/63990655-6dfc1980-caaa-11e9-947d-e9497f29a318.png)
## Autor 
Santiago Rocha Durán - Escuela Colombiana de Ingenieria Julio Garavito
## Licencia
Este proyecto está licenciado bajo GNU General Public License - ver [LICENSE](https://github.com/Santiago-Rocha/AREM2/blob/master/LICENSE.txt) para más detalles 


