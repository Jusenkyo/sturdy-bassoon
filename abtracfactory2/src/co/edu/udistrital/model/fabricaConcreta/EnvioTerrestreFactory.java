package co.edu.udistrital.model.fabricaConcreta;

import co.edu.udistrital.model.EnvioTerrestre;
import co.edu.udistrital.model.fabricaAbstracta.EnvioFactory;
import co.edu.udistrital.model.fabricaAbstracta.Envio;

public class EnvioTerrestreFactory implements EnvioFactory {
    @Override
    public Envio crearEnvio() {
        return new EnvioTerrestre();
    }
}