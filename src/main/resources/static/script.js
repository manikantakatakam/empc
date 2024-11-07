
document.getElementById('apiForm').addEventListener('submit', async function (e) {
    e.preventDefault();
  
    // Get form data
    const url = document.getElementById('url').value;
    const method = document.getElementById('method').value;
    const headersInput = document.getElementById('headers').value;
    const bodyInput = document.getElementById('body').value;
  
    let headers = {};
    let body = null;
  
    try {
      // Parse headers and body if JSON
      if (headersInput.trim()) {
        headers = JSON.parse(headersInput);
      }
  
      if (bodyInput.trim()) {
        body = JSON.parse(bodyInput);
      }
    } catch (error) {
      alert('Invalid JSON in headers or body.');
      return;
    }
  
    // Update UI
    document.getElementById('responseOutput').textContent = 'Loading...';
  
    try {
      // Make the API request
      const response = await fetch(url, {
        method: method,
        headers: headers,
        body: method === 'GET' ? null : JSON.stringify(body)
      });
  
      const responseData = await response.json();
  
      // Display the response data
      document.getElementById('responseOutput').textContent = JSON.stringify(responseData, null, 2);
  
      if (!response.ok) {
        throw new Error(responseData.message || 'API request failed.');
      }
    } catch (error) {
      document.getElementById('responseOutput').textContent = `Error: ${error.message}`;
    }
  });




// // Function to fetch data from a public API
// function fetchData() {
//     fetch('https://jsonplaceholder.typicode.com/posts/1') // Mock API endpoint
//         .then(response => response.json())
//         .then(data => {
//             document.getElementById('response').innerText = `Fetched Data: ${data.title}`;
//         })
//         .catch(error => console.error('Error:', error));
// }

// // Function to send data using POST method
// function postData() {
//     const inputText = document.getElementById('inputText').value;
//     fetch('https://jsonplaceholder.typicode.com/posts', { // Mock API endpoint
//         method: 'POST',
//         headers: {
//             'Content-Type': 'application/json'
//         },
//         body: JSON.stringify({ title: inputText })
//     })
//         .then(response => response.json())
//         .then(data => {
//             document.getElementById('response').innerText = `Posted Data ID: ${data.id}`;
//         })
//         .catch(error => console.error('Error:', error));
// }




// document.getElementById('apiForm').addEventListener('submit', async function (e) {
//   e.preventDefault();

//   // Get form data
//   const url = document.getElementById('url').value;
//   const method = document.getElementById('method').value;
//   const headersInput = document.getElementById('headers').value;
//   const bodyInput = document.getElementById('body').value;

//   let headers = {};
//   let body = null;

//   try {
//     // Parse headers and body if JSON
//     if (headersInput.trim()) {
//       headers = JSON.parse(headersInput);
//     }

//     if (bodyInput.trim()) {
//       body = JSON.parse(bodyInput);
//     }
//   } catch (error) {
//     alert('Invalid JSON in headers or body.');
//     return;
//   }

//   // Update UI
//   document.getElementById('responseOutput').textContent = 'Loading...';

//   try {
//     // Make the API request
//     const response = await fetch(url, {
//       method: method,
//       headers: headers,
//       body: method === 'GET' ? null : JSON.stringify(body)
//     });

//     const responseData = await response.json();

//     // Display the response data
//     document.getElementById('responseOutput').textContent = JSON.stringify(responseData, null, 2);

//     if (!response.ok) {
//       throw new Error(responseData.message || 'API request failed.');
//     }
//   } catch (error) {
//     document.getElementById('responseOutput').textContent = `Error: ${error.message}`;
//   }
// });







