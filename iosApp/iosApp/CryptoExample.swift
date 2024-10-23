//
//  Crypto.swift
//  iosApp
//
//  Created by Jimmy Nelle on 22.10.24.
//  Copyright © 2024 codecentric AG. All rights reserved.
//

import Foundation
import CryptoKit

@objc(CryptoExample) public class CryptoExample: NSObject {
    
   @objc public static func ToSHA256(_ input: String) -> String {
        let data = Data(input.utf8)
        let digest = SHA256.hash(data: data)
        let hashString = digest
            .compactMap { String(format: "%02x", $0) }
            .joined()
        return hashString
    }

}


