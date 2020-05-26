var vue=new Vue({
    el:"#app",
    data:{
        user:{
            id:"",
            username:"",
            email:"",
            age:"",
            sex:""},
            userList:[]
    },
    methods: {
        findAll: function () {

            //在当前方法中定义一个变量，表名是vue对象
            var _this = this;
            axios.get('/vue/user/findAll.do')
                .then(function (response) {
                    // handle success
                    _this.userList = response.data;//相应数据给userList赋值
                    console.log(response);
                })
                .catch(function (error) {
                    // handle error
                    console.log(error);
                });

        },

        findById: function (userid) {
            var _this = this;
            axios.get('/vue/user/findById.do',{params: {id : userid}})
                .then(function (response) {
                    // handle success
                    _this.user = response.data;//相应数据给userList赋值

                    $("#myModal").modal("show");
                    console.log(response);

                })
                .catch(function (error) {
                    // handle error
                    console.log(error);
                });

        },
        update: function (user) {
            console.log(user)
            var _this = this;
            axios.post("/vue/user/updateUser.do",_this.user).then(function (response) {
                _this.findAll();
            }).catch(function (err) {
            });
        }
    },
    created() {
        this.findAll();
    }


});