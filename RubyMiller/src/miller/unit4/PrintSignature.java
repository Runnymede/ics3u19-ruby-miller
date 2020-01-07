package miller.unit4;

/**PrintSignature.java <p>
 * This program prints ASCII art for Ruby and a picture of a computer. <br>
 * It does this using 32 methods: printSignature, printImage, and main, which prints both. <p>
 * December 16, 2019
 * @author Ruby Miller
 */

public class PrintSignature {
	
	
	/**
	 * This method calls the other 2 methods, and prints them both. <br>
	 * @param args - the array of strings that stores arguments passed by the command line.
	 */
	public static void main(String[] args) {
		printSignature(); //Calling the printSignature method
		printImage(); //Calling the printImage method
		
	}
	/**
	 * This method prints the signature. 
	*/
	public static void printSignature() {
		System.out.println(" _____       _           \r\n" + 
				"|  __ \\     | |          \r\n" + 
				"| |__) |   _| |__  _   _ \r\n" + 
				"|  _  / | | | '_ \\| | | |\r\n" + 
				"| | \\ \\ |_| | |_) | |_| |\r\n" + 
				"|_|  \\_\\__,_|_.__/ \\__, |\r\n" + 
				"                    __/ |\r\n" + 
				"                   |___/ ");
	}

	/**
	 * This method prints a picture of a computer in ASCII
	*/
	public static void printImage() {
		System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWWNXKK0OOkkxxddoooollllllllooooooooooooooooooooddxxxkkOO00KXXNNWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWNXK0OkxdooolllllllllllllllooooddxxxxkkOOOOOOOOOOOOkkkxxxxddoooollllllllllllloooooooooddxkOO0KXNWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWNKOkdollllllcclllodxxkO00KKXXXXXXXXXXXXXXXXXXXXXXXKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKXXKKKKK00OOkxxdoolllllllllllloodxk0KXNWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWXkoclccclodxkO0KXXNNNNXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKK00OkxdollccclllllodxO0XNWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMNd;cok0KXNNNNXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKK00OkxdolccllllloxONMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMk'lNNNXNXXNXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKK0Okxo;';dXMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMx'xNXNNNXNXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKK0ood,;0WMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMo'kNXNNNNXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKOoxKk:,kWMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMWl,0NXNNNXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXKKKKKKKKXXXXXXXXXXXXXXXXXXXXXKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKK0KklkK00o,oXMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMN:;KNXNNXXXNXXXXXXXXXNXXK00OOkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkxxxxxxxxxxxxkkkkkOOOO00KKKKKXKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKK0KxlO0000x;cKMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMX;cXNNNNNXXNXXNXXKOkxxxxdddodddxxkkkkOOOOOOOOOOkkkkxxxxxdddddddddddddddddddddddddddddddddddddddxxkkO00KKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKdoO00000k:;kWMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMM0,oNNNNNNXXXNXNOc:looddddddoollcccc:::::::cclllllllcccccccccccccccccccccccllllllllllllllllllllllllllooooooodxkOO0KKKKKKKKKKKKKKKKKKKKKKKKK0oo0000O00Ol,oNMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMk,dNNNNNNNNNXXNd:c;;ccccccccc::::cccclllooooooooooooooooooooooooooooooooooooollllllcccc::::::::::cccccccc::::ccllloodxxk0KKKKKKKKKKKKKKKKKOld0O00OOOOOd,:0WMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMd,ONXNNNNNNNXNXddx;cddddddddddddddddddooddoooooooooooooooooooooooooooooollllllllllooooooooollllllccc::;;;;;:::::::;:::::coox0KKKKKKKKKKK0Kkld0OOOOOOOO0k:,xNMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMo;0NNNNNNXNNXNKoxd;oddddddddddddddddddddddooooooooooooooooooooooooooooolllllllllllloooodddxxxxdddooolllllccccc::;;;;;,;,,;':OKKKKKKKKKKKKKxlx0OOOOOOOOOOOl'cKMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMWlcXNNNNNNXNXXN0oxl;dddddddddddddddddddddddooooooooooooooooooooooooooooolllllllllllllllllllloddkkkkkkxxxdddooollccccccc:,,docOKKKKKKKKKKK0KdlkOOOOOOOOOOOOOx;,xNMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMX:lNNNNNNNXXXXNOoxc:dddddddddddddddddddddddooooooooooooooooooooooooooooolllllllllllllllllllllllodxkkkkkkkxxxxxxddooolccc;:Ool0KKKKKKKKKKKKKolOOOOOOOOOOOOOOOk;'OMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMM0;oNNNNNNNXXNXNkox:cxddddddddddddddddddddddooooooooooooooooooooooooooooollllllllllllllllllllllllllodkkkkkkkkkkxxxxxxoccc,:kloKKKKKKKKKKKKK0ooOOOOOOOOOOOOOOOk;,0MMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMk,dNXNNNNXXXXNXxdd;lxddddddddddddddddddddddooooooooooooooooooooooooooooollllllllllllllllllllllllllllldkOkkkkkkkkxxxxoccc,ckldKKKKKKKKKKKKKOloOOOOOOOOOOOOOkOx':NMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMx;ONXNNNNXXXXNXddo;odddddddddddddddddddddddooooooooooooooooooooooooooooollllllllllllllllllllllllllllcloxOOOkkkkkkkkxlccc,oxckKKKKKKKKKKKKKOldOkkkkkkkOkkkkkOo.oMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMo:0NNNNNNXXXNNKdxl;odddddddddddddddddddddddooooooooooooooooooooooooooooollllllllllllllllllllllllllcllcclxOOOOOkkkkkxlcc:;ddcOKKKKKKKKKKKKKklxOkkkkkkkkkkkkkOc.xMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMWlcXNNNNNNXXXXN0oxc:ddddddddddddddddddddddddooooooooooooooooooooooooooooollllllllllllllllllllllllllllccccldOOOOOOOOOxlcc:;xll0KKKKKKKKKKKKKxlxkkkkkkkkkkkkkkk;'OMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMXclNNNNNNNXXXXNOod::ddddddddddddddddddddddddooooooooooooooooooooooooooooolllllllllllllllllllllllllllcccccclxO0OOOOOOdccc;:xclKKKKKKKKKKKKKKdlkkkkkkkkkkkkkkkx,;XMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMM0:dNNNNNNNXXXNXxod;cxdddddddddddddddddddddddooooooooooooooooooooooooooooolllllllllllllllllllllllllllccccclclk000OOOOdccc;cx:dKKKKKKKKKKKKK0ookkkkkkkkkkkkkkkd'cWMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMk;xNNNNNNNXXXNXxdo;lxdddddddddddddddddddddddooooooooooooooooooooooooooooolllllllllllllllllllllllllllccccccccoO00000Ooccc;lo:xKKKKKKKKKKKKK0ookkkkkkkkkkkkkkkl.dMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMx;ONNNNNNNNXXNKddl;oxdddddddddddddddddddddddooooooooooooooooooooooooooooolllllllllllllllllllllllllllcccccccclx0K000klcc:;ol:OKKKKKKKKKKKKKOodkxkkkkkkkkxkkxk:'kMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMo;0NNNNNNNNXXN0ddc:dddddddddddddddddddddddddooooooooooooooooooooooooooooolllllllllllllllllllllllllllcccccccccoOKKK0xccc:;dcc0KKKKKKKKKKKKKkldkxxxxxxxxxxxxxx,,KMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMWl:XNNNNNNNNNXNOodc:dddddddddddddddddddddddddooooooooooooooooooooooooooooolllllllllllllllllllllllllllccccccccclkKKK0dccc;;dclKKKKKKKKKKKK0Kxlxxxxxxxxxxxxxxxd':NMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMX:cXNNNNNNNNNXNkod:cdddddddddddddddddddddddddooooooooooooooooooooooooooooolllllllllllllllllllllllllllccccccccccdKXX0occc;:o:dKKKKKKKKKKKKKKxlxxxxxxxxxxxxxxxo.oMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMM0;oNNNNNNNNNNNXxoo:lxddddddddddddddddddddddddooooooooooooooooooooooooooooolllllllllllllllllllllllllllcccccccccco0XXOlccc,cockKKKKKKKKKKKKK0doxxxxxxxxxxxxxxxc.lWMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMk,xNNNNNNNNNXNKdoo:oxddddddddddddddddddddddddooooooooooooooooooooooooooooolllllllllllllllllllllllllllcccccccccclOXXkcccc,cocOKKKKKKKKKKKKK0ooxxxxxxxxxxxxxxx:.'cKMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMx,kNXNNNNNNNXN0ool:odddddddddddddddddddddddddooooooooooooooooooooooooooooolllllllllllllllllllllllllllcccccccccclkNXdccc:,lll0KKKKKKKKKKKKKOooxxxxxxxxxxxxxxd::l,;OWMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMo;0NNNNNNNNXXNOloc:ddddddddddddddddddddddddddooooooooooooooooooooooooooooolllllllllllllllllllllllllllcccccccccccxNKoccc;,lcoKKKKKKKKKKKK0Kkloxxdddddddddxdxo;cxd;'dWMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMWc:KNNNNNNNNXXNkcoccddddddddddddddddddddddddddooooooooooooooooooooooooooooolllllllllllllllllllllllllllcccccccccccxX0lccc;;ocxKKKKKKKKKKKK0Kxldxddddddddddddxl;ldxxc'lXMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMX:cXNNNNNNNNNXXxco:cddddddddddddddddddddddddddooooooooooooooooooooooooooooolllllllllllllllllllllllllllcccccccccccdXOlccc,:lckKKKKKKKKKKKKKKdldddddddddddddddc;odxkko':0WMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMM0;oNNNNNNNNNXNXocl:lxdddddddddddddddddddddddddooooooooooooooooooooooooooooolllllllllllllllllllllllllllcccccccccccdKkcccc,clcOKKKKKKKKKKKKK0olddddddddddddddd::ddxkkOx:,xWMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMk,xNNNNNNNNNXNKlcl:oxdddddddddddddddddddddddddooooooooooooooooooooooooooooolllllllllllllllllllllllllllcccccccccccoOxccc:,ccl0KKKKKKKKKKKKK0olddddddddddddddo;cddxxkO0k,:XMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMd,ONNNNNNNNNXNOclc:dxdddddddddddddddddddddddddooooooooooooooooooooooooooooolllllllllllllllllllllllllllccccccccccclolccc;,l:oKKKKKKKKKKKKKKOllddddddddddddddl;cddxxkO0x,oWMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMo;0NNNNNNNNNXNkcl:cdddddddddddddddddddddddddddooooooooooooooooooooooooooooolllllllllllllllllllllllllllccccccccccccccccc;;l:dKKKKKKKKKKKK0Kkcoddddddddddddodc;lddxkkO0l,OMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMNc:XNNNNNNNNNXNx:l:cdxxxdddddddddddddddddddddddooooooooooooooooooooooooooooolllllllllllllllllllllllllllccccccccccccccccc,;c:xKKKKKKKKKKKK0Kxcooodooooooooood:;oddxxkOk,:NMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMX:lNNNNNNNNNNNXd:l:ldxkxdddddddddddddddddddddddooooooooooooooooooooooooooooolllllllllllllllllllllllllllccccccccccccccccc,:c:kKKKKKKKKKKKKKKdcooooooooooooooo::oddxxkOd'dMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMM0;oNNNNNNNNNNNKlcc;ldxkkxddddddddddddddddddddddooooooooooooooooooooooooooooolllllllllllllllllllllllllllcccccccccccccccc:,::c0KKKKKKKKKKKKK0ocooooooooooooool;coodxxkOc,0MMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMk,xNNNNNNNNNNN0lc:;oxxOOxddddddddddddddddddddddooooooooooooooooooooooooooooolllllllllllllllllllllllllllcccccccccccccccc:,c:lKKKKKKKKKKKKKKOlcooooooooooooooc;coodxxkk,cNMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMd,ONNNNNNNXNXNOcc::ddk00Oxdddddddddddddddddddddooooooooooooooooooooooooooooolllllllllllllllllllllllllllcccccccccccccccc;;c;oKKKKKKKKKKKKKKkccoooooooooooooo:;loddxxOo,dMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMo;KNNNNNNNNNNNx:c;:dxOKK0Oxddddddddddddddddddddooooooooooooooooooooooooooooolllllllllllllllllllllllllllcccccccccccccccc;;c:xKKKKKKKKKKKKKKkcloooooooooooooo:;loddxxkc,0MMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMNc:XNNNNNNNNXNXd:c,cdx0XKKKOddddddddddddddddddddooooooooooooooooooooooooooooolllllllllllllllllllllllllllcccccccccccccccc;;ccOKKKKKKKKKKKKKKxcloooooooooooool;:ooodxkx,cNMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMX:lNNNNNNNNNNNXo::,cdkKNXXXKOxddddddddddddddddddooooooooooooooooooooooooooooolllllllllllllllllllllllllllcccccccccccccccc;::l0KKKKKKKKKKKKKKd:lollllllllllloc;:ooodxko,dMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMO;oNNNNNNNNNNNKl::,lxOXNNNXXX0kdddddddddddddddddooooooooooooooooooooooooooooolllllllllllllllllllllllllllccccccccccccccc:;::o0KKKKKKKKKKKKK0o:lllllllllllllo:,cooddxkc,0MMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMk,xNNNNNNNNNXNO::;;ox0WWNNNNNXX0kdddddddddddddddooooooooooooooooooooooooooooolllllllllllllllllllllllllllccccccccccccccc:;::dKKKKKKKKKKKKKKOl:llllllllllllll:;cloddxx,cNMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMd,ONNNNNNNNNNNx;:,;oxOXNNNNNNNNNXKOkdddddddddddooooooooooooooooooooooooooooooollllllllllllllllllllllllllccccccccccccccc:;::xKKKKKKKKKKKKKKOccllllllllllllll;;lloddxo'dMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMo;0NNNNNNNNNNXd,:',lloddxxkkOOOO000Okxddddddddddooooooooooooooooooooooooooooolllllllllllllllllllllllllllccccccccccccccc;;;:kKKKKKKKKKKKKKKkcclllllllllllllc,;lloddx:,OMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMNc:XNNNNNNNNXNXo';:cllllllllllllllccccclllloooodddddddooooooooooooooooooooolooooollllllllllllllllllllllllccccccccccccccc;;;:OKKKKKKKKKKKKKKx:clllllllllllll:,:lloddd,:NMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMX:lNNNNNNNNNNNN0kOOkkkkkkxxxxddolllcccccccccclllllllcccccccccllllloooooooooooolllllllllllllllllllllllllllcccccccccccccc:,;;c0KKKKKKKKKKKKKKo:clllllllllllll;,cllooxl'dMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMM0,oNNNNNNNNNNNNNXNNNNNNNNXXXXKKK00OOOOkkkkkkkxxxddoollcc:::::::cccccccccccccccccccccllllllllllllllllllllccccccccccccccc:,;,oKKKKKKKKKKKKKK0l:lccccccccccccc,,cllodx;'OMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMx,xNNNNNNNNNNNNXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXKK00OOOkkkkxxxxxdddoollcc:::;;;;;:::::::::::::::::::::cccccccllccccccc;,;,dKKKKKKKKKKKKKKOl:lccccccccccccc,,cllodo':NMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMd,ONNNNNNNNNNNNXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXKOO000KKXXXXXXXXXKKK00OOOkkxxxxxxddddoollcc::;;;;;;;;;;;;;::;:;;;;;;;',,;kKKKKKKKKKKKKKKkc:ccccccccccccc:';cllodc.dMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMl,0NNNNNNNNNNNNXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXklooodddxxxxkkkOOO000KKKKKKXXXXXXXXXKKKK000OOkkxxxxddddooollcc::;;,,,''.:OKKKKKKKKKKKKKKx::ccccccccccccc;':cllod;,OMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMWc:XNNNNNNNNNXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXOoooddddddddoooooooddddxxxxxxxxk0XKKKKKKKKKKKKKKKKKKKKKKKKK000OOOkkxxxdoxKKKKKKKKKKKKKKKd;:ccccccccccccc,':clloo':NMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMWd;loooddxxkO00KXXXNNNNNNNXXXXXXXXXXXXXXXXXXXXXXXXXXK0OOkkxxddoooooooodddddddddddllOXKKKKKKK0kxk0KKKK0O0KKKKOOOkOOOOO000KKKKKKKKKKKKKKKKKK0o;ccccccccccccc:''ccc;,,:OMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMNKOOkkxddooooooooolllllooddxxkO0KKXXXXNNXXXXXXXXXXXXXXXXXXXXK00OOkkxxxxxdddddddddkKKKKKKKKKdlllOKKOddodOKKOoloooooooddddkKKKKKKKKKKKKKKKK0l;ccccccccccccc:..,';cdKWMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWWNXKK0OkkxddooooooooooooooooddxkkO000KKXXXXXXXXXXXXXXXXXKKKK0000KKKKKKKKKKKK0kxOKKKOdoox0KKxldddddddddddldKKKKKKKKKKKKKKKKO:;c:::c::c::::c;.'lkXMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWWNXK00Oko,..;lxkkxldkkkxxxxxxxkkOO00KKKXXXXXXXXKKKKKKKKKKKKKKKKKKK00KKKKdcoodddddddddldKKKKKKKKKKKKKKKKk;;c:::::::::::c'.xMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNkc,.;OXNNNN0d0NXXK00OOkkxxxxxxxxxxxddddddxxxkkOO00KKKKKXKKKKKKKKKK0xxxxxxxddddodOKKKKKKKKKKKKKKKKd,;::::::::::;,'.,0MMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWk;',;,oNNNNNN0oxKNNNXXXXXXXXXXXXXXKK00Okkkxxddddl;;::ccclllooddxxkkOO0KKKKKKKK000KKKKKKKKKKKKKKKKKKl,::::::;,'.';:okKWMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNKKXWWMMMMMMMMMMMMMMMMMMMMk..:::;;dXNNNNNKkxxxk0XNNXXXXXXXXXXXKKKKKKKKKKKKKk;,::;;;;;,,ldddddooc;'';:lllllloodxxkOO0KKKKKKKKK0c,::,''';:lx0NMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMXd:cllllooloodxkOO0KNNWMMMMWl.,::::;,:d0XNNXNNKOkkkkkOO0KXXXXXXXKKKKKKKKKKKKKx;;::::::;,c0KKKKKKK0x,...lkkkxdoolllllllcccccccclc..',:lx0NWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMNx::x0KKKK0Okkxdoooloooooddodd; .'',,;;;,;ldOKNNNXNNXK0OkkkkkxxkkkOO00KKKKKKKKKl';;;;;:cox0KKKKKKKKK0c';..;lllooooddxkkkkOOOOkxdolldOXWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMNxccdkkkOOOOOOxkOOO00KKKXKKK0Okxddollccc::;;,'',codkkO00KKXNNXKK0Okkxxxddddddddddc:loodkOKKKKKKKKKKKOd:,;:, ,kkkkkxxddooollllooooddkOXWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMNx:cdxxOKKKKK0OxxkOOOkkddkOOOOOOOkOO00KKXXXXK00OkkdoooooooooooooloooddxkOO0000KKKKKXXXXXKKKKKKK00Oxdlc;,,:::'.,ooolllllllloodxxkkxdolllllxXMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMNx:cxkxdkkkkkkkxxOKKKKKOkkOKK0000OddkkkkkkOOOkxkOOOOO00KKKXXXKK00Okxddoollllllllllooooooooollccc:::;,,,;:::::,.cXWNNXK00OOkxdoolllllcclkKKx,oWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMWkccxOkk0K000OkddxkOOOkxddkO000KK0kkO0KKKKKKKKOxxOOOOkkkkkkxdkOkkkOOOOO00KKKXXXKKK0Okkxddolcc::;,,,,,,'''''','..oKWWMMMMMMMMMMMMMMMXxc,,cxko:;kWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMWOllxOxokOO0KK0kkO0KKKK0kxkOOOOOOkxddOOO0000KK0kkOKK0KKKKKK0kxO000OOOOkdoxkkkkkkkxxxOKKK0OO0KKKKKKK00Okkxdoollc:;:clllllloodxkOO0KXNO;;dkkc:cokXMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMWOlcxOkkOOOOOOkxdxOOO000OkOKK0KKKK0kkO00OOOOOOkddkOOO000KKK0OkO0KK00KK0Okk0KKKKK00xlccxKKkdxkkkOOkkkkkOOO000KKKKKKKKK00Okxdoollccccccc'.:kKo.cKWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMWOlcxOkk0K0KKKKOxkO0OOOkxxkO0O0000OkO0KKKKKKKK0kkk00OOOOOOOkdodkOO000KK0kk0KKKKKKKOxoododOxk0KKKKK00OdoxOOOOOOOOkxkkkkkkOOOO0KKKKKKKKK0d:ll:cxdc:cldOXWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMWOlcxOkxxkkOO00OxxOKKKK0OkO00000OOkxdxOOO000KK0kkO0KKKKKKKK0OxxOOOkOOOOkdodkkOOO000kdoddxoldOKK0KKKKK0xxOKKKKKKKKOddOOOOkkkkkdld0KKKKKK0xlx00Oo,;clcccc;;:cccclodkOKNWMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMWOlcxOkkO000OOOkddxOOOO0Oxk0KKKKKK0OkO000OOOOOkxoxO0000KKKK0Okk0KKKKKKKKOxxOOOkkkkxolodddoldk0KKKKKKKKOxk0K0KKKKKKOxk0K0KKKKKKOollxKKKKK0dok00000l.,c..;lc,..',;;;;,;:cclokKWMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMWOlcx0xlx00KKKK0xxO000OOkddkOOOOO0OkkO0KKK00KK0OxkO0000OOOOkxddO0KKKKKKKOkk0KKK00KKOdllddolldk000KKKKK0xxOKKKKKKKK0kxOKKKKKKKKKkoodooOK0K0dok0OOOO0k;.',;lodxdl:;:loddxxxdolc;;o0NMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMW0l:dXXxcooddxxxdodOKKKKOxxOKK00OOOxdxOOOOO0000Okk0K00KKKKK0kddkkkOOOkkkkxxOKKKKKKKOxdddloodkkkkkkkOOkOxodO00KKKKKKOxk0KKKKKKKK0xodddolkKKOddOOOOOOOOk:.;llooddxxkd:;ldddxxkkO0d. .;xXMMMMMMMMMMMM\r\n" + 
				"MMMMW0c;dXNNXdcddddddlcldddxxdldO0KKKK0Oxk0K000OOOOxddkOOO00KKKKOkxOKKKKKK00Ododkkkkkkkkxdddddllk0KK0KKKK000xoxOOOOOOOkkxox00KKKKK0KOdoddddld0KOodOOOOOOkOkc,:cllooddxxkOOl;cdxxxxxxkx, ...,dXMMMMMMMMMM\r\n" + 
				"MMMWx,;dkkO0K0kkxxdoolloxdddoccooddxxxook0KKKKKKKOxxO00OOOOOOOkddk000KKKKK0Oxk0KKK00OkocldddddxOKKKKKKK0KK0kk0KKKKK000Oddxkkkkkkkkkxoodddook0Kkoxkkkkkkkkkl,:ccllooddxxkOOOl,cdddxxdddc......,xNMMMMMMMM\r\n" + 
				"MMMX;;00kkxxxkkkOOOOOkxxxdooolldddddolcoddxxxkOkxdOKKK00KKKK0xdxOOOOOOkkOkddOKKKKKK0OdoooddddO0KKKKKKK0KKOxOKKKKKKK0K0kk0KKKK00OOxl:ldddodOK0xoxkkkkkkkkkx,..',;cooddxkxddxxkO0KXXXXXXKo.......cKMMMMMMM\r\n" + 
				"MMMWd,cdxO0000OkkxxxkkOOOOOOkxxxdoooolldxdddoooccdxxkkOO0K0kxk0KKKKKK00kdoxkkkkkkkkdoddoloooxOO00KKKKKK0kk0KKKKKKKK0OkOKKKK0KK0KOdollddox0K0xoxkkkkkkkkkkl. .....';cooodk0XNXXXXXXKKKKKKd'..'''.;KMMMMMM\r\n" + 
				"MMMMNOollccccldkOO00OOkxxxxkkOOOOOOOkxdddooodddlodddooooddllxkO00KKKK0kxk0KKK00OxlccoddocdkOOkkOOOOOkkxdx00KKKKKKK0kO0KKKKKKKK0kdodolook0KOdoxxxxxxxxxxd:. ..........,xNNXXXXXXXXXXKKKKKKk:..','.:XMMMMM\r\n" + 
				"MMMMMMMMWNKOxollc::cldkOOOOOkkxxxxkkkOOOOOOkkxdlloodddxddocooooddxxxxook0KKK0K0kdodllddok0KK0KKKK00OkdoxkkkOkkOOOkxOKKKKK0KKK0xodddocoOKKOooxxxxxxxxxxc,,.  ..........,l0XXXXXXXXXXKKKKKKK0x:'','.oWMMMM\r\n" + 
				"MMMMMMMMMMMMMMMWX0kdllcc::codkkOkOkkxxdxxxkkOOOOOOkkxddoolcoddxddddolcodddxxxxdodddoloxOKK0KKKKKKK0xxk0KKKK00OOkxdxkkkkkkO00OdoddddodOK0kodxxxxxxxxxo,,xXc  ........'''',dKXXXXXXXXKKKKKKKKK0xl,'.'OMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMWXOxollcc:clodkkkkkkxxdddxxkkkOO0OOkxxdddoodddolddddooocoddddcck0KKK0KKKKK0kxO00KK0KK00K0OO0K00OOkkkkocodddoox0K0xldddddddddd:'lKMMk. ........''',,'lKXXXXXXXKKKKKKKKKKKKOo,.dMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMNKOxollcc:cloxxkkkkxxddoddxxkkOOOOOOkxdoloooddddolddolclddxxkkO0KKOxk0K00KKKKKK0OO0KKKKK0KKK0xlcoddookKK0dldddddddddc,;OWMMMNl  .......''',,,'lKXXXXXXKKKKKKKKKKKK0Kx.oMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWNKOxollc::clodxxxxxxddoooddxxkkO00Okkxddocclox0xodddoooodddlokkO000KKKK0kk0KKKKKKKKKOdodlododOKKOolodddddodo;,dNMMMMMMXc .......''',,;,,xXXXXXXKKKKKKKKKKKKKKd.dMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWN0kxoolc::clodxxxddddoolooddxxkOOOxdxOKKxloodddddddllooooddddxxxox0KKKKK0KK0kdoddolox0KKkoloooooooo:'c0WMMMMMMMMXl.......''',,;;,:0XXXXXKKKKKKKKOOOKKKc,OMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWX0kdollc::clodddddddoolllooddxkO00OOkxxddooollddxdddddooccoddxxxkO0OxoddddllkKKKklloooooooc,;xNMMMMMMMMMMMWk,.....''',,;;;,dXXXXXKKKKKKOxdxdxKx,oWMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWKOkdolc:;:clodddddddollclloodxkOO0OkkddddooooddddolddddoooooclddddodOKK0xllolloool;'lXMMMMMMMMMMMMMMMXo'...''',,;;;'lKXXXXK0OkkxdxOkdkk;cXMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWN0kdolc:;;;:loooooooollccclloddxkOOOkkkxxddlcoddddddddlldddox0KK0dclllllll:':OWMMMMMMMMMMMMMMMMMMXd,...',,,;;'c0XXXOlcclloddxxOd;lXMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWX0kolcc;;;;:lloooooollcc:cclooddxkO0OkkxxddooodlldookKKKOocllllllc,,xNMMMMMMMMMMMMMMMMMMMMMMNOl;...';:':KXKX0xoodddxkOx:;xNMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNKOxolc:;,,;:cllllllllcc::::cllodxkO0OOxxoloxOKKKkcclccllc;'lKMMMMMMMMMMMMMMMMMMMMMMMMMMMN0xl;,'.'dkO0KKK00Oxoc::dXMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWN0kxolc:;,,;:clllllllllc::::cclodxkO0KKK0d:cccccc:';kWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWX0kdllllllcccccld0NMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWX0kdlc:;,',,;:cccccccccc:;::cloddc;:cccc:,'oXMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWNNNNNWMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWXOxdolc;,'',;::cccccccc::'.:cccc,':0WMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWNKOxoc:;,'',,;:ccc'.:::;',xNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWNKkdlc:;'''..',.'oXMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWX0kdl:,,c0WMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWNWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n" + 
				"cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc");
	}
}
