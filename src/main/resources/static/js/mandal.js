function save() {
    let url = "http://localhost:8080/mandal";

    let test = {
        "Title": "Mandal Project",
        "Task": "Post Mapping Test"
    };
    fetch(url, {
        method: 'POST',
        headers: {'Content-Type': 'application/json;charset=utf-8'},
        credentials: 'include',
        body: JSON.stringify(test)
    })
        .then(function (response) {
            return response.json();
        })
        .then(function (myJson) {
            console.log(JSON.stringify(myJson));
        });
}
