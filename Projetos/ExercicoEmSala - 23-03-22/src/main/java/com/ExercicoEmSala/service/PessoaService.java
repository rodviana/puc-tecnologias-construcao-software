package com.ExercicoEmSala.service;

import com.ExercicoEmSala.model.Empregado;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {

    public static String valorInss(Empregado empregado)
    {
      try{
          if (empregado==null || empregado.getSalario() == null)
              throw new NullPointerException();
          return String.valueOf(empregado.getSalario() - empregado.getSalario()*0.05);
      }catch (NullPointerException e)
      {
          return ("O empregado não possui valores para calcular o INSS");
      }
      catch (Exception e)
      {
          return ("Ocorreu um erro no calculo do INSS");
      }
    }



}
