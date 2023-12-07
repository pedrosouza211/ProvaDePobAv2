import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Cliente {
    int id;
    String nome;
    String endereco;
    String postalCode;
    String pais;
    String cpf;
    String passaporte;
    String email;
    String dataNascimento;

    public Cliente(int id, String nome, String endereco, String postalCode, String pais, String cpf,
                   String passaporte, String email, String dataNascimento) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.postalCode = postalCode;
        this.pais = pais;
        this.cpf = cpf;
        this.passaporte = passaporte;
        this.email = email;
        this.dataNascimento = dataNascimento;
    }
}

class Quarto {
    int id;
    String nomeQuarto;
    int qtdeCamas;
    boolean temBanheiro;
    String descricao;

    public Quarto(int id, String nomeQuarto, int qtdeCamas, boolean temBanheiro, String descricao) {
        this.id = id;
        this.nomeQuarto = nomeQuarto;
        this.qtdeCamas = qtdeCamas;
        this.temBanheiro = temBanheiro;
        this.descricao = descricao;
    }
}

class Cama {
    int id;
    String codigoCama;
    boolean ehBeliche;
    String posicao;
    String descricao;

    public Cama(int id, String codigoCama, boolean ehBeliche, String posicao, String descricao) {
        this.id = id;
        this.codigoCama = codigoCama;
        this.ehBeliche = ehBeliche;
        this.posicao = posicao;
        this.descricao = descricao;
    }
}

class Reserva {
    int id;
    int idCliente;
    int idQuarto;
    int idCama;
    String dataInicio;
    String dataFim;

    public Reserva(int id, int idCliente, int idQuarto, int idCama, String dataInicio, String dataFim) {
        this.id = id;
        this.idCliente = idCliente;
        this.idQuarto = idQuarto;
        this.idCama = idCama;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>();
        List<Quarto> quartos = new ArrayList<>();
        List<Cama> camas = new ArrayList<>();
        List<Reserva> reservas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int escolha = 0;

        while (escolha != 18) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Incluir Cliente");
            System.out.println("2. Listar Clientes");
            System.out.println("3. Alterar Cliente");
            System.out.println("4. Excluir Cliente");
            System.out.println("5. Incluir Quarto");
            System.out.println("6. Listar Quartos");
            System.out.println("7. Alterar Quarto");
            System.out.println("8. Excluir Quarto");
            System.out.println("9. Incluir Cama");
            System.out.println("10. Listar Camas");
            System.out.println("11. Alterar Cama");
            System.out.println("12. Excluir Cama");
            System.out.println("13. Incluir Reserva");
            System.out.println("14. Listar Reservas");
            System.out.println("15. Alterar Reserva");
            System.out.println("16. Excluir Reserva");
            System.out.println("18. Sair");

            escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    
                    System.out.println("Digite o ID do cliente:");
                    int idCliente = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Digite o nome do cliente:");
                    String nomeCliente = scanner.nextLine();

                    System.out.println("Digite o endereço do cliente:");
                    String enderecoCliente = scanner.nextLine();

                    System.out.println("Digite o código postal do cliente:");
                    String postalCodeCliente = scanner.nextLine();

                    System.out.println("Digite o país do cliente:");
                    String paisCliente = scanner.nextLine();

                    System.out.println("Digite o CPF do cliente:");
                    String cpfCliente = scanner.nextLine();

                    System.out.println("Digite o passaporte do cliente:");
                    String passaporteCliente = scanner.nextLine();

                    System.out.println("Digite o e-mail do cliente:");
                    String emailCliente = scanner.nextLine();

                    System.out.println("Digite a data de nascimento do cliente:");
                    String dataNascimentoCliente = scanner.nextLine();

                    Cliente novoCliente = new Cliente(idCliente, nomeCliente, enderecoCliente, postalCodeCliente,
                            paisCliente, cpfCliente, passaporteCliente, emailCliente, dataNascimentoCliente);
                    clientes.add(novoCliente);
                    break;
                case 2:
                    
                    for (Cliente cliente : clientes) {
                        System.out.println("ID: " + cliente.id);
                        System.out.println("Nome: " + cliente.nome);
                        System.out.println("Endereço: " + cliente.endereco);
                        System.out.println("Código Postal: " + cliente.postalCode);
                        System.out.println("País: " + cliente.pais);
                        System.out.println("CPF: " + cliente.cpf);
                        System.out.println("Passaporte: " + cliente.passaporte);
                        System.out.println("Email: " + cliente.email);
                        System.out.println("Data de Nascimento: " + cliente.dataNascimento);
                        System.out.println("--------------------");
                    }
                    break;
                case 3:
                    
                    System.out.println("Digite o ID do cliente que deseja alterar:");
                    int idAlterarCliente = scanner.nextInt();
                    scanner.nextLine();

                    Cliente clienteSelecionado = null;

                    for (Cliente cliente : clientes) {
                        if (cliente.id == idAlterarCliente) {
                            clienteSelecionado = cliente;
                            break;
                        }
                    }

                    if (clienteSelecionado != null) {
                        System.out.println("Digite o novo nome do cliente:");
                        String novoNomeCliente = scanner.nextLine();

                        System.out.println("Digite o novo endereço do cliente:");
                        String novoEnderecoCliente = scanner.nextLine();

                        System.out.println("Digite o novo código postal do cliente:");
                        String novoPostalCodeCliente = scanner.nextLine();

                        System.out.println("Digite o novo país do cliente:");
                        String novoPaisCliente = scanner.nextLine();

                        System.out.println("Digite o novo CPF do cliente:");
                        String novoCpfCliente = scanner.nextLine();

                        System.out.println("Digite o novo passaporte do cliente:");
                        String novoPassaporteCliente = scanner.nextLine();

                        System.out.println("Digite o novo e-mail do cliente:");
                        String novoEmailCliente = scanner.nextLine();

                        System.out.println("Digite a nova data de nascimento do cliente:");
                        String novaDataNascimentoCliente = scanner.nextLine();

                        clienteSelecionado.nome = novoNomeCliente;
                        clienteSelecionado.endereco = novoEnderecoCliente;
                        clienteSelecionado.postalCode = novoPostalCodeCliente;
                        clienteSelecionado.pais = novoPaisCliente;
                        clienteSelecionado.cpf = novoCpfCliente;
                        clienteSelecionado.passaporte = novoPassaporteCliente;
                        clienteSelecionado.email = novoEmailCliente;
                        clienteSelecionado.dataNascimento = novaDataNascimentoCliente;

                        System.out.println("Cliente alterado com sucesso.");
                    } else {
                        System.out.println("Cliente não encontrado.");
                    }
                    break;
                case 4:
                    
                    System.out.println("Digite o ID do cliente que deseja excluir:");
                    int idExcluirCliente = scanner.nextInt();
                    scanner.nextLine();

                    clientes.removeIf(cliente -> cliente.id == idExcluirCliente);
                    System.out.println("Cliente excluído com sucesso.");
                    break;
                case 5:
                    
                    System.out.println("Digite o ID do quarto:");
                    int idQuarto = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Digite o nome do quarto:");
                    String nomeQuarto = scanner.nextLine();

                    System.out.println("Digite a quantidade de camas no quarto:");
                    int qtdeCamasQuarto = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("O quarto tem banheiro? (true/false):");
                    boolean temBanheiroQuarto = scanner.nextBoolean();
                    scanner.nextLine();

                    System.out.println("Digite a descrição do quarto:");
                    String descricaoQuarto = scanner.nextLine();

                    Quarto novoQuarto = new Quarto(idQuarto, nomeQuarto, qtdeCamasQuarto, temBanheiroQuarto, descricaoQuarto);
                    quartos.add(novoQuarto);
                    break;
                case 6:
                    
                    for (Quarto quarto : quartos) {
                        System.out.println("ID: " + quarto.id);
                        System.out.println("Nome do Quarto: " + quarto.nomeQuarto);
                        System.out.println("Quantidade de Camas: " + quarto.qtdeCamas);
                        System.out.println("Tem Banheiro: " + quarto.temBanheiro);
                        System.out.println("Descrição: " + quarto.descricao);
                        System.out.println("--------------------");
                    }
                    break;
                case 7:
                    
                    System.out.println("Digite o ID do quarto que deseja alterar:");
                    int idAlterarQuarto = scanner.nextInt();
                    scanner.nextLine();

                    Quarto quartoSelecionado = null;

                    for (Quarto quarto : quartos) {
                        if (quarto.id == idAlterarQuarto) {
                            quartoSelecionado = quarto;
                            break;
                        }
                    }

                    if (quartoSelecionado != null) {
                        System.out.println("Digite o novo nome do quarto:");
                        String novoNomeQuarto = scanner.nextLine();

                        System.out.println("Digite a nova quantidade de camas no quarto:");
                        int novaQtdeCamasQuarto = scanner.nextInt();
                        scanner.nextLine();

                        System.out.println("O quarto tem banheiro? (true/false):");
                         boolean novoTemBanheiroQuarto = scanner.nextBoolean();
                        scanner.nextLine();

                        System.out.println("Digite a nova descrição do quarto:");
                        String novaDescricaoQuarto = scanner.nextLine();

                        quartoSelecionado.nomeQuarto = novoNomeQuarto;
                        quartoSelecionado.qtdeCamas = novaQtdeCamasQuarto;
                        quartoSelecionado.temBanheiro = novoTemBanheiroQuarto;
                        quartoSelecionado.descricao = novaDescricaoQuarto;

                        System.out.println("Quarto alterado com sucesso.");
                    } else {
                        System.out.println("Quarto não encontrado.");
                    }
                    break;
                case 8:
                    
                    System.out.println("Digite o ID do quarto que deseja excluir:");
                    int idExcluirQuarto = scanner.nextInt();
                    scanner.nextLine();

                    quartos.removeIf(quarto -> quarto.id == idExcluirQuarto);
                    System.out.println("Quarto excluído com sucesso.");
                    break;
                case 9:
                    
                    System.out.println("Digite o ID da cama:");
                    int idCama = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Digite o código da cama:");
                    String codigoCama = scanner.nextLine();

                    System.out.println("A cama é beliche? (true/false):");
                    boolean ehBelicheCama = scanner.nextBoolean();
                    scanner.nextLine();

                    System.out.println("Digite a posição da cama:");
                    String posicaoCama = scanner.nextLine();

                    System.out.println("Digite a descrição da cama:");
                    String descricaoCama = scanner.nextLine();

                    Cama novaCama = new Cama(idCama, codigoCama, ehBelicheCama, posicaoCama, descricaoCama);
                    camas.add(novaCama);
                    break;
                case 10:
                    
                    for (Cama cama : camas) {
                        System.out.println("ID: " + cama.id);
                        System.out.println("Código da Cama: " + cama.codigoCama);
                        System.out.println("Beliche: " + cama.ehBeliche);
                        System.out.println("Posição: " + cama.posicao);
                        System.out.println("Descrição: " + cama.descricao);
                        System.out.println("--------------------");
                    }
                    break;
                case 11:
                   
                    System.out.println("Digite o ID da cama que deseja alterar:");
                    int idAlterarCama = scanner.nextInt();
                    scanner.nextLine();

                    Cama camaSelecionada = null;

                    for (Cama cama : camas) {
                        if (cama.id == idAlterarCama) {
                            camaSelecionada = cama;
                            break;
                        }
                    }

                    if (camaSelecionada != null) {
                        System.out.println("Digite o novo código da cama:");
                        String novoCodigoCama = scanner.nextLine();

                        System.out.println("A cama é beliche? (true/false):");
                        boolean novoEhBelicheCama = scanner.nextBoolean();
                        scanner.nextLine();

                        System.out.println("Digite a nova posição da cama:");
                        String novaPosicaoCama = scanner.nextLine();

                        System.out.println("Digite a nova descrição da cama:");
                        String novaDescricaoCama = scanner.nextLine();

                        camaSelecionada.codigoCama = novoCodigoCama;
                        camaSelecionada.ehBeliche = novoEhBelicheCama;
                        camaSelecionada.posicao = novaPosicaoCama;
                        camaSelecionada.descricao = novaDescricaoCama;

                        System.out.println("Cama alterada com sucesso.");
                    } else {
                        System.out.println("Cama não encontrada.");
                    }
                    break;
                case 12:
                    
                    System.out.println("Digite o ID da cama que deseja excluir:");
                    int idExcluirCama = scanner.nextInt();
                    scanner.nextLine();

                    camas.removeIf(cama -> cama.id == idExcluirCama);
                    System.out.println("Cama excluída com sucesso.");
                    break;
                case 13:
                    
                    System.out.println("Digite o ID da reserva:");
                    int idReserva = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Digite o ID do cliente:");
                    int idClienteReserva = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Digite o ID do quarto:");
                    int idQuartoReserva = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Digite o ID da cama:");
                    int idCamaReserva = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Digite a data de início:");
                    String dataInicioReserva = scanner.nextLine();

                    System.out.println("Digite a data de fim:");
                    String dataFimReserva = scanner.nextLine();

                    Reserva novaReserva = new Reserva(idReserva, idClienteReserva, idQuartoReserva,
                            idCamaReserva, dataInicioReserva, dataFimReserva);
                    reservas.add(novaReserva);
                    break;
                case 14:
                    
                    for (Reserva reserva : reservas) {
                        System.out.println("ID: " + reserva.id);
                        System.out.println("ID Cliente: " + reserva.idCliente);
                        System.out.println("ID Quarto: " + reserva.idQuarto);
                        System.out.println("ID Cama: " + reserva.idCama);
                        System.out.println("Data Início: " + reserva.dataInicio);
                        System.out.println("Data Fim: " + reserva.dataFim);
                        System.out.println("--------------------");
                    }
                    break;
                case 15:
                   
                    System.out.println("Digite o ID da reserva que deseja alterar:");
                    int idAlterarReserva = scanner.nextInt();
                    scanner.nextLine();

                    Reserva reservaSelecionada = null;

                    for (Reserva reserva : reservas) {
                        if (reserva.id == idAlterarReserva) {
                            reservaSelecionada = reserva;
                            break;
                        }
                    }

                    if (reservaSelecionada != null) {
                        System.out.println("Digite o novo ID do cliente:");
                        int novoIdClienteReserva = scanner.nextInt();
                        scanner.nextLine();

                        System.out.println("Digite o novo ID do quarto:");
                        int novoIdQuartoReserva = scanner.nextInt();
                        scanner.nextLine();

                        System.out.println("Digite o novo ID da cama:");
                        int novoIdCamaReserva = scanner.nextInt();
                        scanner.nextLine();

                        System.out.println("Digite a nova data de início:");
                        String novaDataInicioReserva = scanner.nextLine();

                        System.out.println("Digite a nova data de fim:");
                        String novaDataFimReserva = scanner.nextLine();

                        reservaSelecionada.idCliente = novoIdClienteReserva;
                        reservaSelecionada.idQuarto = novoIdQuartoReserva;
                        reservaSelecionada.idCama = novoIdCamaReserva;
                        reservaSelecionada.dataInicio = novaDataInicioReserva;
                        reservaSelecionada.dataFim = novaDataFimReserva;

                        System.out.println("Reserva alterada com sucesso.");
                    } else {
                        System.out.println("Reserva não encontrada.");
                    }
                    break;
                case 16:
                    
                    System.out.println("Digite o ID da reserva que deseja excluir:");
                    int idExcluirReserva = scanner.nextInt();
                    scanner.nextLine();

                    reservas.removeIf(reserva -> reserva.id == idExcluirReserva);
                    System.out.println("Reserva excluída com sucesso.");
                    break;
                case 18:
                    
                    System.out.println("Sistema encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}
