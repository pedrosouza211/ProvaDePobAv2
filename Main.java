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

class SistemaClientes {
    List<Cliente> clientes;

    public SistemaClientes() {
        this.clientes = new ArrayList<>();
    }

    public void incluirCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void listarClientes() {
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
    }

    public void alterarCliente(int clienteId, String novoNome, String novoEndereco, String novoPostalCode,
                               String novoPais, String novoCpf, String novoPassaporte, String novoEmail,
                               String novaDataNascimento) {
        for (Cliente cliente : clientes) {
            if (cliente.id == clienteId) {
                cliente.nome = novoNome;
                cliente.endereco = novoEndereco;
                cliente.postalCode = novoPostalCode;
                cliente.pais = novoPais;
                cliente.cpf = novoCpf;
                cliente.passaporte = novoPassaporte;
                cliente.email = novoEmail;
                cliente.dataNascimento = novaDataNascimento;
                System.out.println("Cliente alterado com sucesso.");
                return;
            }
        }
        System.out.println("Cliente não encontrado.");
    }

    public void excluirCliente(int clienteId) {
        clientes.removeIf(cliente -> cliente.id == clienteId);
        System.out.println("Cliente excluído com sucesso.");
    }
}

class SistemaQuartos {
    List<Quarto> quartos;

    public SistemaQuartos() {
        this.quartos = new ArrayList<>();
    }

    public void incluirQuarto(Quarto quarto) {
        quartos.add(quarto);
    }

    public void listarQuartos() {
        for (Quarto quarto : quartos) {
            System.out.println("ID: " + quarto.id);
            System.out.println("Nome do Quarto: " + quarto.nomeQuarto);
            System.out.println("Quantidade de Camas: " + quarto.qtdeCamas);
            System.out.println("Tem Banheiro: " + quarto.temBanheiro);
            System.out.println("Descrição: " + quarto.descricao);
            System.out.println("--------------------");
        }
    }

    public void alterarQuarto(int quartoId, String novoNomeQuarto, int novaQtdeCamas, boolean novoTemBanheiro,
                               String novaDescricao) {
        for (Quarto quarto : quartos) {
            if (quarto.id == quartoId) {
                quarto.nomeQuarto = novoNomeQuarto;
                quarto.qtdeCamas = novaQtdeCamas;
                quarto.temBanheiro = novoTemBanheiro;
                quarto.descricao = novaDescricao;
                System.out.println("Quarto alterado com sucesso.");
                return;
            }
        }
        System.out.println("Quarto não encontrado.");
    }

    public void excluirQuarto(int quartoId) {
        quartos.removeIf(quarto -> quarto.id == quartoId);
        System.out.println("Quarto excluído com sucesso.");
    }
}

class SistemaCamas {
    List<Cama> camas;

    public SistemaCamas() {
        this.camas = new ArrayList<>();
    }

    public void incluirCama(Cama cama) {
        camas.add(cama);
    }

    public void listarCamas() {
        for (Cama cama : camas) {
            System.out.println("ID: " + cama.id);
            System.out.println("Código da Cama: " + cama.codigoCama);
            System.out.println("Beliche: " + cama.ehBeliche);
            System.out.println("Posição: " + cama.posicao);
            System.out.println("Descrição: " + cama.descricao);
            System.out.println("--------------------");
        }
    }

    public void alterarCama(int camaId, String novoCodigoCama, boolean novoEhBeliche, String novaPosicao,
                            String novaDescricao) {
        for (Cama cama : camas) {
            if (cama.id == camaId) {
                cama.codigoCama = novoCodigoCama;
                cama.ehBeliche = novoEhBeliche;
                cama.posicao = novaPosicao;
                cama.descricao = novaDescricao;
                System.out.println("Cama alterada com sucesso.");
                return;
            }
        }
        System.out.println("Cama não encontrada.");
    }

    public void excluirCama(int camaId) {
        camas.removeIf(cama -> cama.id == camaId);
        System.out.println("Cama excluída com sucesso.");
    }
}

class SistemaReservas {
    List<Reserva> reservas;

    public SistemaReservas() {
        this.reservas = new ArrayList<>();
    }

    public void incluirReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    public void listarReservas() {
        for (Reserva reserva : reservas) {
            System.out.println("ID: " + reserva.id);
            System.out.println("ID Cliente: " + reserva.idCliente);
            System.out.println("ID Quarto: " + reserva.idQuarto);
            System.out.println("ID Cama: " + reserva.idCama);
            System.out.println("Data Início: " + reserva.dataInicio);
            System.out.println("Data Fim: " + reserva.dataFim);
            System.out.println("--------------------");
        }
    }

    public void alterarReserva(int reservaId, int novoIdCliente, int novoIdQuarto, int novoIdCama,
                               String novaDataInicio, String novaDataFim) {
        for (Reserva reserva : reservas) {
            if (reserva.id == reservaId) {
                reserva.idCliente = novoIdCliente;
                reserva.idQuarto = novoIdQuarto;
                reserva.idCama = novoIdCama;
                reserva.dataInicio = novaDataInicio;
                reserva.dataFim = novaDataFim;
                System.out.println("Reserva alterada com sucesso.");
                return;
            }
        }
        System.out.println("Reserva não encontrada.");
    }

    public void excluirReserva(int reservaId) {
        reservas.removeIf(reserva -> reserva.id == reservaId);
        System.out.println("Reserva excluída com sucesso.");
    }
}

public class Main {
    public static void main(String[] args) {
        SistemaClientes sistemaClientes = new SistemaClientes();
        SistemaQuartos sistemaQuartos = new SistemaQuartos();
        SistemaCamas sistemaCamas = new SistemaCamas();
        SistemaReservas sistemaReservas = new SistemaReservas();
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
            System.out.println("17. Sair");

            escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    // ... (código existente)
                    break;
                case 2:
                    // ... (código existente)
                    break;
                case 3:
                    // ... (código existente)
                    break;
                case 4:
                    // ... (código existente)
                    break;
                case 5:
                    // ... (código existente)
                    break;
                case 6:
                    // ... (código existente)
                    break;
                case 7:
                    // ... (código existente)
                    break;
                case 8:
                    // ... (código existente)
                    break;
                case 9:
                    // ... (código existente)
                    break;
                case 10:
                    // ... (código existente)
                    break;
                case 11:
                    // ... (código existente)
                    break;
                case 12:
                    // ... (código existente)
                    break;
                case 13:
                    // Incluir Reserva
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

                    Reserva novaReserva = new Reserva(idReserva, idClienteReserva, idQuartoReserva, idCamaReserva,
                            dataInicioReserva, dataFimReserva);
                    sistemaReservas.incluirReserva(novaReserva);
                    break;
                case 14:
                    sistemaReservas.listarReservas();
                    break;
                case 15:
                    // Alterar Reserva
                    System.out.println("Digite o ID da reserva que deseja alterar:");
                    int idAlterarReserva = scanner.nextInt();
                    scanner.nextLine();

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

                    sistemaReservas.alterarReserva(idAlterarReserva, novoIdClienteReserva, novoIdQuartoReserva,
                            novoIdCamaReserva, novaDataInicioReserva, novaDataFimReserva);
                    break;
                case 16:
                    // Excluir Reserva
                    System.out.println("Digite o ID da reserva que deseja excluir:");
                    int idExcluirReserva = scanner.nextInt();
                    scanner.nextLine();

                    sistemaReservas.excluirReserva(idExcluirReserva);
                    break;
                 case 17:
                                    // ... (código existente)
                                    break;
                                case 18:
                                    System.out.println("Saindo do programa. Até logo!");
                                    break;
                                default:
                                    System.out.println("Opção inválida. Tente novamente.");
                            }
                        }
                        scanner.close();
                    }
                }
