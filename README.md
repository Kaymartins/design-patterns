### Resumo dos Padrões e Suas Finalidades

| **Padrão**         | **Finalidade**                                                                 |
|---------------------|-------------------------------------------------------------------------------|
| **State**           | Gerencia os estados dos veículos (ex: disponível, em manutenção) e define comportamentos específicos para cada estado. |
| **Observer**        | Notifica automaticamente o sistema de monitoramento (`FleetMonitor`) quando ocorrem mudanças no estado de um veículo. |
| **Factory Method**  | Centraliza e encapsula a criação de objetos veículo (ex: `VehicleBus`, `VehicleMetro`) em um único ponto. |
| **Abstract Factory**| Cria famílias de objetos relacionados (ex: motores e freios específicos) para diferentes tipos de veículos. |
| **Template Method** | Define um fluxo fixo para inspeções (etapas comuns), permitindo personalização em subclasses (ex: verificação de motor específico). |
| **Decorator**       | Adiciona funcionalidades extras a veículos (ex: GPS, segurança) de forma flexível, sem modificar sua estrutura original. |
| **Bridge**          | Separa a abstração (controle do veículo) da implementação (detalhes do veículo), permitindo que ambas variem independentemente. |
| **Singleton**       | Garante que exista apenas uma instância global do monitor de frota (`FleetMonitor`) em todo o sistema. |