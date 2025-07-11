package co.edu.udistrital.model.fabricaConcreta;

import co.edu.udistrital.model.EnvioAereo;
import co.edu.udistrital.model.fabricaAbstracta.EnvioFactory;
import co.edu.udistrital.model.fabricaAbstracta.Envio;

public class EnvioAereoFactory implements EnvioFactory {
    @Override
    public Envio crearEnvio() {
        return new EnvioAereo();
    }
}