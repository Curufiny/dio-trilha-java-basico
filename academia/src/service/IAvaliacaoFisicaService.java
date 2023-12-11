package me.dio.academia.digital.service;

import me.dio.academia.digital.entity.AvaliacaoFisica;
import me.dio.academia.digital.entity.form.AvaliacaoFisicaForm;
import me.dio.academia.digital.entity.form.AvaliacaoFisicaUpdateForm;

import java.util.List;

public interface IAvaliacaoFisicaService {
    /**
     * Cria uma Avaliação Física e salva no banco de dados.
     * @param form - formulário referente aos dados para criação da Avaliação Física no banco de dados.
     * @return - Avaliação Física recém-criada.
     */
    AvaliacaoFisica create(AvaliacaoFisicaForm form);

    /**
     * Retorna uma Avaliação Física que está no banco de dados de acordo com seu Id.
     * @param id - id da Avaliação Física que será exibida.
     * @return - Avaliação Física de acordo com o Id fornecido.
     */
    AvaliacaoFisica get(Long id);

    /**
     * Retorna todas as Avaliações Física que estão no banco de dados.
     * @return - Uma lista com todas as Avaliações Física que estão salvas no DB.
     */
    List<AvaliacaoFisica> getAll();

    /**
     * Atualiza a avaliação física.
     * @param id - id da Avaliação Física que será atualizada.
     * @param formUpdate - formulário referente aos dados necessários para atualização da Avaliação
     * Física no banco de dados.
     * @return - Avaliação Física recém-atualizada.
     */
    AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm formUpdate);

    /**
     * Deleta uma Avaliação Física específica.
     * @param id - id da Avaliação Física que será removida.
     */
    void delete(Long id);
}package me.dio.academia.digital.service;

        import me.dio.academia.digital.entity.Matricula;
        import me.dio.academia.digital.entity.form.MatriculaForm;

        import java.util.List;

public interface IMatriculaService {
    /**
     * Cria uma Matrícula e salva no banco de dados.
     * @param form - formulário referente aos dados para criação da Matrícula no banco de dados.
     * @return - Matrícula recém-criada.
     */
    Matricula create(MatriculaForm form);

    /**
     * Retorna uma Matrícula que está no banco de dados de acordo com seu Id.
     * @param id - id da Matrícula que será exibida.
     * @return - Matrícula de acordo com o Id fornecido.
     */
    Matricula get(Long id);

    /**
     * Retorna todas as Matrículas que estão no banco de dados.
     * @return - uma lista com todas as Matrículas que estão salvas no DB.
     */
    List<Matricula> getAll(String bairro);

    /**
     * Deleta uma Matrícula específica.
     * @param id - id da Matrícula que será removida.
     */
    void delete(Long id);

}