func solution(_ s:String) -> String {
    
    var result: String = ""
    
    for str in s.components(separatedBy: " ") {
        for (i, ch) in str.enumerated() {
            if i == 0 {
                result.append(ch.uppercased())
            } else {
                result.append(ch.lowercased())
            }
        }
        
        result.append(" ")
    }
    
    return String(result.dropLast())
}
