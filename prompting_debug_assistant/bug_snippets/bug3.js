function startDownloads() {
    console.log("Starting download queue...");
    
    var files = ["image.png", "script.js", "style.css", "data.json", "index.html"];

    for (var i = 0; i < files.length; i++) {
        var fileName = files[i];
        
        setTimeout(function() {
            console.log("Download complete for file index " + i);
        }, 1000 * (i + 1));
    }
}

function init() {
    console.log("Initializing System...");
    startDownloads();
    console.log("Downloads queued in background.");
}

init();


