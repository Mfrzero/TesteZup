var app = angular.module('myApp', []);

app.controller('myCtrl', function ($scope, $http) {

    $scope.salvar = function () {
        $http.post("http://localhost:8080/dados", {
            'id': $scope.id,
            'nome': $scope.nome,
            'email': $scope.email,
            'cpf': $scope.cpf,
            'data': $scope.data
        }).then(nossoerro => {
            alert('Sucesso ao cadastrar!!')
        }).catch(erro => {
            if (erro.data.message.includes('unico_cpf')) {
                alert('CPF já cadastrado!, insira outro!')
            }
            else if (erro.data.message.includes('unico_email')) {
                alert('E-mail já cadastrado!, insira outro!')
            }
            else {
                alert('CPF ou E-mail inválidos ou já cadastrados! Preencha os dados corretamente!')
            }
        })
    };
});