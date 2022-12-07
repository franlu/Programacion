/**
 *
 * @author Fran <fran.lucena@gmail.com>
 */
public class SysProperties {

    public static void main(String[] args) {
        
        String nombreSO = "os.name";
        String versionSO = "os.version";
        String arquitecturaSO = "os.arch";
        System.out.println("\nInformación sobre el SO: ");
        System.out.println("\nNombre del SO: "
                + System.getProperty(nombreSO));
        System.out.println("Version del SO: "
                + System.getProperty(versionSO));
        System.out.println("Arquitectura del SO: "
                + System.getProperty(arquitecturaSO));
                
    } // main
} // clase
