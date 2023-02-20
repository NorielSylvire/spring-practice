// Call the dataTables jQuery plugin
$(document).ready(function() {
  loadUsers();
  $('#usersTable').DataTable();
});

async function loadUsers() {
  const rawResponse = await fetch('users', {
    method: 'GET',
    headers: {
      'ACCEPT': 'application/json',
      'Content-Type': 'application/json'
    }
  });
  const users = await rawResponse.json();

  let htmlList = '';
  let btn = '</td><td><a href="#" class="btn btn-danger btn-circle btn-sm"><i class="fas fa-trash"></i></a></td></tr>';
  for (let user of users) {
    let userHtml = '<tr><td>' + user.fullName + '</td><td>' + user.username + '</td><td>'
      + user.email + '</td><td>' + user.email + '</td><td>' + user.phoneNumber + '</td><td>'
      + user.dob + '</td><td>' + user.id
      + btn;
    htmlList += userHtml;
  }

  document.querySelector('#usersTable tbody').outerHTML = htmlList;

  console.log(users);
}