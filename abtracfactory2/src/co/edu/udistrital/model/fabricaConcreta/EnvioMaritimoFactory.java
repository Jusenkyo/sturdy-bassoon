package co.edu.udistrital.model.fabricaConcreta;

import co.edu.udistrital.model.EnvioMaritimo;
import co.edu.udistrital.model.fabricaAbstracta.EnvioFactory;
import co.edu.udistrital.model.fabricaAbstracta.Envio;

public class EnvioMaritimoFactory implements EnvioFactory {
    @Override
    public Envio crearEnvio() {
        return new EnvioMaritimo();
    }
}